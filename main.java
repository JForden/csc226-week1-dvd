package reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public void tsvReader(database db, String ratingFileLocation, String basicsFileLocation) {
        try (BufferedReader ratingReader = new BufferedReader(new FileReader(ratingFileLocation))) {
            String line;
            boolean isFirstLine = true;  
            
            while ((line = ratingReader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                
                VideoObj holder = new VideoObj(); 
                
                String[] fields = line.split("\t");
                holder.setTconst(fields[0].trim());
                holder.setAverageRating(Double.parseDouble(fields[1]));
                holder.setNumVotes(Integer.parseInt(fields[2]));
                db.addVideo(holder);
            }
        } catch (IOException e) { 
            System.err.println("Error reading ratings file: " + e.getMessage());
        }

        try(BufferedReader basicsReader = new BufferedReader(new FileReader(basicsFileLocation))){
            String line;
            Boolean isFirstLine = true;

            while ((line = basicsReader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String[] fields = line.split("\t");
                VideoObj holder = db.getVideo(fields[0].trim());
                if(holder==null){
                    continue;
                }
                holder.setTitleType(fields[1]);
                holder.setPrimaryTitle(fields[2]);
                holder.setOriginalTitle(fields[3]);
                holder.setAdult(Integer.parseInt(fields[4]) == 1);
                if (fields[5].equals("\\N")) {
                    holder.setStartYear(0);
                } else {
                    holder.setStartYear(Integer.parseInt(fields[5]));
                }
                if (fields[6].equals("\\N")) {
                    holder.setEndYear(0);
                } else {
                    holder.setEndYear(Integer.parseInt(fields[6]));
                }
                if (fields[7].equals("\\N")) {
                    holder.setRuntimeMinutes(0);
                } else {
                    holder.setRuntimeMinutes(Integer.parseInt(fields[7]));
                }
                String[] genres = fields[8].split(",");
                holder.setGenres(genres);

            }
        }
        catch (IOException e) { 
            System.err.println("Error reading ratings file: " + e.getMessage());
        }

    }
    
    public static void main(String[] args) {
        database db = new database(); 
        Main main = new Main();
        main.tsvReader(db, "subset.title.ratings.tsv", "subset.title.basics.tsv");
        db.purgeBadVideos();
        System.out.println(db.getLength());
        //db.getHighestRatedVideos(10);
        db.getRatingDistribution();
    }
}
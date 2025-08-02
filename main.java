import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {

    //TODO, add false entries in BOTH - EVIL
    public void tsvReader(database db, String ratingFileLocation, String basicsFileLocation) {
        try (BufferedReader ratingReader = new BufferedReader(new FileReader(ratingFileLocation))) {
            String line;
            boolean isFirstLine = true;  // Fix: was "boolean ratingReader=true"
            
            while ((line = ratingReader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                
                VideoObj holder = new VideoObj();  // Fix: was "new holder = new VideoObj();"
                // pull rating and ID info first
                String[] fields = line.split("\t");
                holder.setTconst(fields[0]);
                holder.setAverageRating(Double.parseDouble(fields[1]));
                holder.setNumVotes(Integer.parseInt(fields[2]));
                db.addVideo(holder);
            }
        } catch (IOException e) {  // Add missing catch block
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        database db = new database();  // Fix: lowercase 'd' to match your class name
        Main main = new Main();        // Fix: need instance to call non-static method
        main.tsvReader(db, "./title.ratings.tsv", "./title.basics.tsv");
    }
}
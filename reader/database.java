package reader;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class database {

    private TreeMap<String, VideoObj> videoList;

    public database() {
        videoList = new TreeMap<>();
    }

    public void addVideo(VideoObj video) {
        videoList.put(video.getTconst(), video);
    }

    public VideoObj getVideo(String tConst){
        return videoList.get(tConst);
    }

    public void purgeBadVideos() {
        videoList.values().removeIf(video -> video.getTitleType()==null);
    }

    public void listVideos(int amount) {
        for(VideoObj video: videoList.values()){
            if(amount<0){
                break;
            }
            System.out.println(video.toString());
            amount--;
        }
    }
    public int getLength(){
        return videoList.size();
    }

    public void getHighestRatedVideos(int amount) {
    videoList.values()  
        .stream()
        .sorted((v1, v2) -> Double.compare(v2.getAverageRating(), v1.getAverageRating()))
        .limit(amount)
        .forEach(video -> System.out.println(video.toString()));
    }
    public void getRatingDistribution(){
        int[] totals = new int[11];
        for(VideoObj video: videoList.values()){
            int rating = (int) video.getAverageRating();
            totals[rating]+=1;
        }
        // print out the distribution
        for (int i = 0; i <= 10; i++) {
            double percentage = ((double) totals[i] / videoList.size()) * 100;
            System.out.printf("%.2f%% of movies had a rating of: %d%n", percentage, i);
        }
    }
}

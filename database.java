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

    public List<VideoObj> getTopRatedVideos(int requestedTopVideos){
        return videoList.values()
            .stream()
            .sorted((v1, v2) -> Double.compare(v2.getAverageRating(), v1.getAverageRating()))
            .limit(requestedTopVideos)
            .collect(Collectors.toList());
    }
}
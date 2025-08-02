public class VideoObj implements IMDB {
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private boolean isAdult;
    private int startYear;
    private Integer endYear;
    private Integer runtimeMinutes;
    private String[] genres;
    private double averageRating;
    private int numVotes;

    public VideoObj(String tconst, String titleType, String primaryTitle, String originalTitle, 
                   boolean isAdult, int startYear, Integer endYear, Integer runtimeMinutes, 
                   String[] genres, double averageRating, int numVotes) {
        this.tconst = tconst;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.endYear = endYear;
        this.runtimeMinutes = runtimeMinutes;
        this.genres = genres;
        this.averageRating = averageRating;
        this.numVotes = numVotes;
    }

    public VideoObj(){
        this.tconst = "";
        this.titleType = "";;
        this.primaryTitle = "";;
        this.originalTitle = "";;
        this.isAdult = false;
        this.startYear = 0;
        this.endYear = 0;
        this.runtimeMinutes = 0;
        this.genres = new string[0];
        this.averageRating = 0.0;
        this.numVotes = 0;
    }

    // Getters and setters for each field
    public String getTconst() {
        return tconst;
    }
    public void setTconst(String tconst) {
        this.tconst = tconst;
    }
    public String getTitleType() {
        return titleType;
    }
    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }
    public String getPrimaryTitle() {
        return primaryTitle;
    }
    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }
    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
    public boolean isAdult() {
        return isAdult;
    }
    public void setAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }
    public int getStartYear() {
        return startYear;
    }
    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
    public Integer getEndYear() {
        return endYear;
    }
    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }
    public Integer getRuntimeMinutes() {
        return runtimeMinutes;
    }
    public void setRuntimeMinutes(Integer runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }
    public String[] getGenres() {
        return genres;
    }
    public void setGenres(String[] genres) {
        this.genres = genres;
    }
    public double getAverageRating() {
        return averageRating;
    }
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
    public int getNumVotes() {
        return numVotes;
    }
    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }
    @Override
    public String toString() {
        return "VideoObj{" +
                "tconst='" + tconst + '\'' +
                ", titleType='" + titleType + '\'' +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult=" + isAdult +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", runtimeMinutes=" + runtimeMinutes +
                ", genres=" + Arrays.toString(genres) +
                ", averageRating=" + averageRating +
                ", numVotes=" + numVotes +
                '}';
    }
}



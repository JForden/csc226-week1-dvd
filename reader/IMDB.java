package reader;
public interface IMDB {
    String getTconst();
    void setTconst(String tconst);
    
    String getTitleType();
    void setTitleType(String titleType);
    
    String getPrimaryTitle();
    void setPrimaryTitle(String primaryTitle);
    
    String getOriginalTitle();
    void setOriginalTitle(String originalTitle);
    
    boolean isAdult();
    void setAdult(boolean isAdult);
    
    int getStartYear();
    void setStartYear(int startYear);
    
    Integer getEndYear();
    void setEndYear(Integer endYear);
    
    Integer getRuntimeMinutes();
    void setRuntimeMinutes(Integer runtimeMinutes);
    
    String[] getGenres();
    void setGenres(String[] genres);
    
    double getAverageRating();
    void setAverageRating(double averageRating);
    
    int getNumVotes();
    void setNumVotes(int numVotes);
    
    String toString();
}
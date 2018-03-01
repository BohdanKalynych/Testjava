package com.company;


public class Song {

    private String SongName;
    private String SongStyle;
    private Double SongLenght;

    public void setSongName(String newValue) {
        SongName = newValue;
    }

    public void setSongLenght(Double newValue) {
        SongLenght = newValue;
    }

    public void setSongStyle(String newValue) {
        SongStyle = newValue;
    }

    public String getSongName(){
        return SongName;
    }

    public Double getSongLenght() {
        return SongLenght;
    }

    public String getSongStyle() {
        return SongStyle;
    }

    public String getFullSongInfo(){
        String fullInfo;
        fullInfo = SongName +"   "+ SongLenght +"   "+ SongStyle;
        return fullInfo;
    }

}

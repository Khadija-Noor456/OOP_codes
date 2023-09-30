package labtask_1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Music {
    private String tittle;
    private String duration;
    private String genre;
    private Date releaseDate;
    private Artist singer;

    public Music(String tittle, String duration, String genre, Date releaseDate, Artist singer) {
        this.tittle = tittle;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Artist getSinger() {
        return this.singer;
    }

    public void setSinger(Artist singer) {
        this.singer = singer;
    }

    public String toString() {
        return String.format("%-20s%-17s%-18s%-15s%-19s", this.tittle, this.duration, this.genre, this.releaseDate, this.singer);
    }

    public boolean equals(Music m) {
        return this.tittle.equals(m.tittle);
    }
}

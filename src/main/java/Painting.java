public class Painting {
    private String title;
    private int year;
    private String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getArtist() {
        return artist;
    }

    public Painting(String title, int year, String artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", artist='" + artist + '\'' +
                '}';
    }
}

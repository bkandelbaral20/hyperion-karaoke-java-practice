
import java.util.Arrays;

public class Song {
    //    private string properties for title, artist, and a private list of strings for lyrics
    private String title;
    private String artist;
    private String lyrics;

    //    a constructor to assign values to all instance properties
    public Song(String title, String artist, String lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    //     getters and setters for all instance properties
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    //    a static method parseLyrics that takes in a single string input of possibly several words and returns a
//    list of strings that are the output of splitting all the words in the input string on a single space character " "
    public static void main(String[] args) {
        parseLyrics("how are you ");
    }
    public static String parseLyrics(String input) {
        String[] output = input.split("\\s+");

        Arrays.stream(output).forEach(part -> System.out.println(part));

        return input;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Album {

    //    a private string property for the album name
//    a private property for a list of song objects called songs
    private String albumName;
    private List<Song> songs;

    public Album(){};

//    a constructor that sets both instance properties

    public Album(String name, List<Song> songs) {
        this.albumName = name;
        this.songs = songs;
    }

//    getters and setters for both instance properties

    public String getName() {
        return albumName;
    }

    public void setName(String name) {
        this.albumName = name;
    }

    public List<Song>  getSongs() {
        return songs;
    }

    public void setSongs(List<Song>  songs) {
        this.songs = songs;
    }

//    a public method with a void return type called printTrackListings that will iterate through
//    all songs for a given album

    public static void main(String[] args) {
        Album a = new Album("90s Hits", Arrays.asList(
           new Song("Every Day is a Winding Road", "Sheryl Crow", Song.parseLyrics("Everyday is a winding road ..." +
                   " I get a little bit closer to feeling fine")),
           new Song("Ready to Go", "Republica", Song.parseLyrics("I'm standing on the rooftops shouting out," +
                   " Baby, I'm ready to go")),
           new Song("Airbag", "Radiohead", Song.parseLyrics("In an interstellar burst I am back to save the universe"))
        ));
        //calling method to run
        a.printTrackListings();
    }



    public void printTrackListings() {
        System.out.println(albumName + "track Listing ....");
        int count = 1;
        System.out.println();
        for (Song str : songs) {
            System.out.println(count + ". " + str.getTitle() + "by" + str.getArtist());
            count++;
        }
    }
}

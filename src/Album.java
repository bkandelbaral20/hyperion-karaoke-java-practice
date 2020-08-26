import java.util.ArrayList;

public class Album {

    //    a private string property for the album name
//    a private property for a list of song objects called songs
    private String name;
    private String[] songs;

    public Album(){};

//    a constructor that sets both instance properties

    public Album(String name, String[] songs) {
        this.name = name;
        this.songs = songs;
    }

//    getters and setters for both instance properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

//    a public method with a void return type called printTrackListings that will iterate through
//    all songs for a given album

    public static void main(String[] args) {
        String[] songs = {"Infinity", "Infinity 2", "Infinity 3"};
        Album album = new Album("XX", songs);

        //calling method to run
        album.printTrackListings(album);
    }

    public void printTrackListings(Album album) {
        System.out.println(name);
        String[] trackList = album.getSongs();
        for (String str : trackList) {
            System.out.println( str);
        }
    }
}

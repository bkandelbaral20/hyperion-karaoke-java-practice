import java.io.IOException;

import static java.lang.Thread.sleep;

public class LyricsPlayer extends Player {
    private String textColor = "default";

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    //default constructor
    public LyricsPlayer() {}

//    a constructor that sets the textColor value
    public LyricsPlayer(String textColor) {
        this.textColor = textColor;
    }

//    getter and setter for textColor


    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

//    display method
    private void displayText(String string) {
        String colorCode = RESET;
        switch(textColor.toLowerCase()) {
            case "red":
                colorCode = RED;
                break;
            case "green":
                colorCode = GREEN;
                break;
            case "yellow":
                colorCode = YELLOW;
                break;
            case "blue":
                colorCode = BLUE;
                break;
            case "purple":
                colorCode = PURPLE;
                break;
            case "cyan":
                colorCode = CYAN;
                break;
        }
        System.out.printf("%s%s", colorCode, string);
    }


    @Override
    public void play(Album album)  {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec(RESET + "Now playing... SONG-TITLE by SONG-ARTIST");
                    sleep(INTRO_PAUSE);
            for (String word : displayText()) {
//                if (voice.isEmpty()) {
//                    r.exec("say" + word);
//                } else {
//                    r.exec("say -v " + voice + " " + word);
//                }
                sleep(WORD_CADENCE);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void play(Song song) throws IOException, InterruptedException {

    }
}

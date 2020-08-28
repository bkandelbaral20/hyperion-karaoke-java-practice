import java.io.IOException;

import static java.lang.Thread.sleep;

public class MusicPlayer extends Player {

    private String voice = "";

    //empty constructor
    public MusicPlayer() {
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void play(Song song) {
        Runtime r = Runtime.getRuntime();
        try {
            sleep(INTRO_PAUSE);
            for (String word : song.getLyrics()) {
                r.exec("say" + word);
                sleep(WORD_CADENCE);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            {
                System.out.println("something went wrong");
            }
        }
    }
        @Override
        public void play (Album album){}

        //an implementation of the play method that takes in a song instance and does the following...
        // this method will create a runtime instance
        public static void main (String[]args) throws IOException {
            Runtime r = Runtime.getRuntime();
            r.exec("say  hello!");
        }

//    a command can be issued from Java to the terminal using r.exec() and passing in a string that will be executed by
//    the terminal (this will require handling a checked exception; please use a try-catch for this)

    }

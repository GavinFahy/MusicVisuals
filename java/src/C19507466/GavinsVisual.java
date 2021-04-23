package C19507466;

import ie.tudublin.*;

public class GavinsVisual extends Visual {
    public void settings()
    {
        size(700, 700);
    }

    public void setup()
    {
        startMinim();

        loadAudio("Michael Calfan - Resurrection (Axwell's Recut Club Version).mp3");
    }

    public void keyPressed()
    {
        if (key == '1')
        {
            println("Press 1 to play music");
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw()
    {

    }

}

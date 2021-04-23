package C19507466;

import ie.tudublin.*;

public class GavinsVisual extends Visual {

    Lines L;

    public void settings()
    {
        size(700, 700);
    }

    public void setup()
    {
        startMinim();

        loadAudio("Michael Calfan - Resurrection (Axwell's Recut Club Version).mp3");

        L = new Lines(this);
    }

    public void keyPressed()
    {
        if (key == '1')
        {
            getAudioPlayer().play();
        }
        if (key == '2')
        {
            getAudioPlayer().pause();
        }
        if (key == '3')
        {
            getAudioPlayer().cue(0);
        }
    }

    public void draw()
    {
        background(0);
        L.render();
    }

}

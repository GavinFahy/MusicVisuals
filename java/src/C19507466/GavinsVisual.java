package C19507466;

import ie.tudublin.*;

public class GavinsVisual extends Visual {

    Lines l;
    Circle c;

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        startMinim();

        loadAudio("Michael Calfan - Resurrection (Axwell's Recut Club Version).mp3");

        l = new Lines(this);
        c = new Circle(this);
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

        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
        
       // l.render();
        c.render();
    }


}

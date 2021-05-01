package C19507466;

import ie.tudublin.*;

public class GavinsVisual extends Visual {

    Sphere s;
    Circle c;
    Cube cube;
    Line l;

    public void settings()
    {
        size(700, 700, P3D);
    }

    public void setup()
    {
        startMinim();
        surface.setResizable(true);

        loadAudio("Michael Calfan - Resurrection (Axwell's Recut Club Version).mp3");

        s = new Sphere(this);
        c = new Circle(this);
        cube = new Cube(this);
        l = new Line(this);
    }

    public void keyPressed()
    {
        if (key == 'p')
        {
            getAudioPlayer().play();
        }
        if (key == 's')
        {
            getAudioPlayer().pause();
        }
        if (key == 'r')
        {
            getAudioPlayer().cue(0);
        }
    }

    public void draw()
    {
        background(0);
        surface.setResizable(true);
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
        
        
        
        if (key == '1')
        {
            s.render();
            c.render();
        }

        if (key == '2')
        {
            cube.render();
            l.render();
        }
    }
}

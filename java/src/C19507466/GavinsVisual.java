package C19507466;

import ie.tudublin.*;

public class GavinsVisual extends Visual {

    Sphere s;
    Circle c;
    Cube cube;
    Line l;
    Instructions i;

    int cubeOption = 0;
    int sphereOption = 0;
    int circleOption = 0;
    int lineOption = 0;
    int instructionsOption = 1;

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
        i = new Instructions(this);
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
            sphereOption = 1;
            circleOption = 1;
            instructionsOption = 0;

            cubeOption = 0;
            lineOption = 0;
        }

        if (key == '2')
        {
           cubeOption = 1;
           lineOption = 1;
           instructionsOption = 0;

           sphereOption = 0;
           circleOption = 0;
        }

        if (key == '3')
        {
            instructionsOption = 1;
        }

        if(instructionsOption == 1)
        {
            i.render();
        }

        if(sphereOption == 1 && circleOption == 1)
        {
            s.render();
            c.render();
        }

        if(cubeOption == 1 && lineOption == 1)
        {
            cube.render();
            l.render();
        }
    }
}

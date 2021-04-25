package C19507466;

import processing.core.PApplet;

public class Circle {

    GavinsVisual gv;

    public Circle(GavinsVisual gv)
    {
        this.gv = gv;
    }

    public void render()
    {
        gv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255/2), 255, 255);
            gv.ellipse(50, 50, 250*gv.getAudioBuffer().get(i), 250*gv.getAudioBuffer().get(i));
            gv.ellipse(650, 50, 250*gv.getAudioBuffer().get(i), 250*gv.getAudioBuffer().get(i));
            gv.ellipse(50, 650, 250*gv.getAudioBuffer().get(i), 250*gv.getAudioBuffer().get(i));
            gv.ellipse(650, 650, 250*gv.getAudioBuffer().get(i), 250*gv.getAudioBuffer().get(i));
        }
    }
    
}

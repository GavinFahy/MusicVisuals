package C19507466;

import processing.core.PApplet;

public class Circle {

    GavinsVisual gv;
    float cy = 0;

    public Circle(GavinsVisual gv)
    {
        this.gv = gv;
        cy = this.gv.height / 2;
    }

    public void render()
    {
        gv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(
                PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            gv.ellipse(i, cy, i, cy + cy * gv.getAudioBuffer().get(i));
        }
    }
    
}

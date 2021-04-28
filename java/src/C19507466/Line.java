package C19507466;

import processing.core.PApplet;

public class Line {
    
    GavinsVisual gv;

    public Line(GavinsVisual gv)
    {
        this.gv = gv;
    }

    public void render()
    {
        gv.colorMode(PApplet.HSB);
        //left hand side line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(45 * gv.getAudioBuffer().get(i),1 * gv.getAudioBuffer().get(i),1 * gv.getAudioBuffer().get(i),699);
        }

        //top line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(1, 1, 699,50 * gv.getAudioBuffer().get(i));
        }

        //right hand side line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(699, 699 * gv.getAudioBuffer().get(i), 699,50);
        }

        //bottom line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(699 * gv.getAudioBuffer().get(i), 699, 1 * gv.getAudioBuffer().get(i),699);
        }
    }
}

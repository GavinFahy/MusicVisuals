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
            gv.line(20,20,20,680 / gv.getAudioBuffer().get(i));
        }

        //top line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(20, 20, 680 / gv.getAudioBuffer().get(i),20);
        }

        //right hand side line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(680, 20, 680,680 / gv.getAudioBuffer().get(i));
        }
        
        //bottom line
        for(int i = 0 ; i < gv.getAudioBuffer().size() ; i ++)
        {
            gv.stroke(PApplet.map(i, 0, gv.getAudioBuffer().size(), 0, 255), 255, 255);
            gv.line(680, 680, 680 / gv.getAudioBuffer().get(i),680);
        }
    }
}

package C19507466;

import processing.core.PApplet;

public class Cube {

    GavinsVisual gv;

    public Cube(GavinsVisual gv)
    {
        this.gv = gv;
    }
    
    float angle = 0;

    public void render()
    {
        //box 1
        gv.pushMatrix();
        gv.translate(50, 50, -200);
        gv.rotateY(angle);
        gv.rotateX(angle);
        gv.noFill();
        gv.stroke(PApplet.map(gv.getSmoothedAmplitude()*5,0,1,0,255),255,255);
        gv.box(100+ (gv.getSmoothedAmplitude() * 10));
        gv.popMatrix();
        angle += gv.getSmoothedAmplitude()*20;

        //box 2
        gv.pushMatrix();
        gv.translate(350, 350, -400);
        gv.rotateZ(angle);
        gv.noFill();
        gv.stroke(PApplet.map(gv.getSmoothedAmplitude()*5,0,1,0,255),255,255);
        gv.box(100+ (gv.getSmoothedAmplitude() * 10));
        gv.popMatrix();
        angle += gv.getSmoothedAmplitude()*20;
    }
}

package C19507466;

import processing.core.PApplet;

public class Sphere
{
    GavinsVisual gv;

    public Sphere(GavinsVisual gv)
    {
        this.gv = gv;
    }

    float angle = 0;

    public void render()
    {
        gv.colorMode(PApplet.HSB);
        gv.pushMatrix();
        gv.translate(350, 350, -200);
        gv.rotateY(angle);
        gv.noFill();
        gv.stroke(PApplet.map(gv.getSmoothedAmplitude()*5,0,1,0,255),255,255);
        gv.sphere(200+gv.getSmoothedAmplitude()*400);
        gv.popMatrix();
        angle += gv.getSmoothedAmplitude()*20;
    }
    
}

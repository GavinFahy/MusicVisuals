package C19507466;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ie.tudublin.*;
import processing.core.PApplet;

public class Lines extends Visual
{
    GavinsVisual gv;
    float cy = 0;
    float[] lerpedBuffer;

    public Lines(GavinsVisual gv)
    {
        this.gv = gv;
        cy = this.gv.height / 2;
    }

       public void setup()
    {
        colorMode(HSB);
        lerpedBuffer = new float[width];
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

            gv.line(i, cy, i, cy + cy * gv.getAudioBuffer().get(i));
        }
    }
  
 

  /*
      public void draw()
      {
          //step 5
          background(0);
          stroke(255);
          float halfheight = height / 2;
          for(int i = 0; i < ab.size(); i++)
          {
              float c = map(i, 0, ab.size(), 0, 255);
              stroke(c, 255, 255);
              lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);
  
              line(i, halfheight - lerpedBuffer[i] * halfheight * 4, i,halfheight + lerpedBuffer[i] * halfheight * 4);
              //println(ab.get(i));
          }
          for(int i = 0; i < ab.size(); i++)
          {
              float c = map(i, 0, ab.size(), 0, -255);
              stroke(c, 255, 255);
              lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.1f);
  
              line(0 - lerpedBuffer[i] * 305 * 4, i, 115 + lerpedBuffer[i] * 380 * 4,i);
              //println(ab.get(i));
          }
      }
      */
}

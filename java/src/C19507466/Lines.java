package C19507466;

//import processing.core.PApplet;

public class Lines
{
    GavinsVisual gv;
    float cy = 0;
    float wy = 0;


    public Lines(GavinsVisual gv)
    {
        this.gv = gv;
        cy = this.gv.height / 350;
    }

    public void render()
    {

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

package C19507466;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ie.tudublin.*;

public class Lines extends Visual
{
      //step 1
      Minim minim; //connect to minim libary
      //step 2
      //AudioInput ai; //How to connect to mic
      //step 3
      AudioBuffer ab; //samples
      //connect to mp3 file
      AudioPlayer ap;
  
      float[] lerpedBuffer;
  
  
      public void settings()
      {
          size(700,700);
      } 
  /*
      public void setup()
      {
          //step4
          minim = new Minim(this);
          //ai = minim.getLineIn(Minim.MONO, width, 44100, 16);//first is number of channels 2nd is frame size 3rd sample rate
          ap = minim.loadFile("heroplanet.mp3", width);
          ap.play();
          //ab = ai.mix; // connect buffer to mic
          ab = ap.mix; //connects buffer to mp3 file
          //add colour
          colorMode(HSB);
          lerpedBuffer = new float[width];
      }
  */
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
}

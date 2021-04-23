package ie.tudublin;

//import example.CubeVisual;
//import example.MyVisual;
//import example.RotatingAudioBands;
import C19507466.Lines;
import C19507466.GavinsVisual;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new GavinsVisual());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}
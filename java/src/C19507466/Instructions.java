package C19507466;

public class Instructions {

    GavinsVisual gv;

    public Instructions(GavinsVisual gv)
    {
        this.gv = gv;
    }

    public void render()
    {
       gv.text("press p to play", 350, 350);
       gv.text("Press s to stop", 250, 250);
       gv.text("Press r to rewind", 150, 150);
       gv.text("Press 1 to get visual 1", 25, 50);
       gv.text("Press 2 to get visual 2", 50, 25);
    }
}

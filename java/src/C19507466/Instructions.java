package C19507466;

public class Instructions {

    GavinsVisual gv;

    public Instructions(GavinsVisual gv)
    {
        this.gv = gv;
    }

    public void render()
    {
       gv.text("press p to play", 300, 310);
       gv.text("Press s to stop", 300, 330);
       gv.text("Press r to rewind", 300, 350);
       gv.text("Press 1 to get visual 1", 300, 370);
       gv.text("Press 2 to get visual 2", 300, 390);
    }
}

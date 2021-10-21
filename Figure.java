package paint;
import java.awt.*;

abstract public class Figure {

    protected int width =0, lenght = 0;
    private Color c;
    private Point p;

    public Figure(Color c, Point p ) {
        this.c = c;
        this.p = p;
    }


    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    public Color getC() {
        return c;
    }

    public Point getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", c=" + c +
                ", p=" + p +
                '}';
    }
}

package paint;
import java.awt.*;
import java.io.Serializable;

abstract public class Figure implements Serializable {

    protected Color c;
    protected Point p;
    protected int width;
    protected int length;
    protected Point newOrigin;

    public Figure(Point pt, Color col ) {
        this.c = col;
        this.p = pt;
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
                "c=" + c +
                ", p=" + p +
                '}';
    }
}

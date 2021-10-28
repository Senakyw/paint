package paint;
import java.awt.*;

abstract public class Figure {

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
                "c=" + c +
                ", p=" + p +
                '}';
    }
}

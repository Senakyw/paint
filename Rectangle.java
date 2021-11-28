package paint;

import java.awt.*;
import java.io.Serializable;

public class Rectangle extends Figure implements Serializable {
    protected int width =0, length = 0;

    public Rectangle(int px, int py,Color c) {
        super(new Point(px,py), c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

        length = Math.abs(heightBB);
        width = Math.abs(widthBB);

        int x = p.getX();
        int y = p.getY();

        if(heightBB<0){
            y-=length;
        }
        if(widthBB<0){
            x-=width;
        }
        newOrigin = new Point(x,y);
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(newOrigin.getX(), newOrigin.getY(), width, length);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "c=" + c +
                ", p=" + p +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

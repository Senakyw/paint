package paint;

import java.awt.*;
import java.io.Serializable;

public class Circle extends Ellipse implements Serializable {

    public Circle(int px, int py, Color c) {
        super(px,py,c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        //super.setBoundingBox(heightBB, widthBB);
        if (Math.abs(heightBB) > Math.abs(widthBB)) {
            semiAxysX = Math.abs(heightBB);
            semiAxysY = Math.abs(heightBB);
        }
        else {
            semiAxysX = Math.abs(widthBB);
            semiAxysY = Math.abs(widthBB);
        }

        int x = p.getX();
        int y = p.getY();

        if(heightBB<0){
            y-=semiAxysX;
        }
        if(widthBB<0){
            x-=semiAxysX;
        }
        newOrigin = new Point(x,y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillOval(newOrigin.getX(), newOrigin.getY(), semiAxysX, semiAxysY);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "semiAxysX=" + semiAxysX +
                ", semiAxysY=" + semiAxysY +
                ", c=" + c +
                ", p=" + p +
                ", newOrigin=" + newOrigin +
                '}';
    }
}

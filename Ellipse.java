package paint;

import java.awt.*;
import java.io.Serializable;

public class Ellipse extends Figure implements Serializable {

    protected int semiAxysX =0, semiAxysY= 0;

    public Ellipse(int px, int py,Color c) {
        super(new Point(px,py),c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

        semiAxysY = Math.abs(heightBB);
        semiAxysX = Math.abs(widthBB);

        int x = p.getX();
        int y = p.getY();

        if(heightBB<0){
            y-=semiAxysY;
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
        return "Ellipse{" +
                "semiAxysX=" + semiAxysX +
                ", semiAxysY=" + semiAxysY +
                ", c=" + c +
                ", p=" + p +
                '}';
    }
}
//
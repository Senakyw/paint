package paint;

import java.awt.*;
import java.io.Serializable;

public class Square extends Rectangle implements Serializable {

    public Square(int px, int py,Color c) {
        super(px,py,c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

        if (Math.abs(heightBB) > Math.abs(widthBB) ){
            width = Math.abs(heightBB);
            length = Math.abs(heightBB);
        } else {
            length = Math.abs(widthBB);
            width = Math.abs(widthBB);
        }

        int x = p.getX();
        int y = p.getY();

        if(heightBB<0){
            y-=length;
        }
        if(widthBB<0){
            x-=length;
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
        return "Square{" +
                "c=" + c +
                ", p=" + p +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

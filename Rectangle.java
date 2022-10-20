package paint;

import java.awt.*;
import java.io.Serializable;

public class Rectangle extends Figure implements Serializable {
    protected int width =0, length = 0;

    public Rectangle(int px, int py,Color c) {
        super(new Point(px,py), c);//call the construtor of Figure
        newOrigin = new Point();//Start point on the window
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

        length = Math.abs(heightBB);
        width = Math.abs(widthBB);

        int x = p.getX(); //local variable in order to create new point
        int y = p.getY();

        if(heightBB<0){//Solution for negative boundingBox
            y-=length;
        }
        if(widthBB<0){
            x-=width;
        }
        newOrigin = new Point(x,y);// Create new point even if boundingBox's area is positive
    }
    @Override
    public void draw(Graphics g) {//Method which enable to draw the figure
        g.setColor(c);
        g.fillRect(newOrigin.getX(), newOrigin.getY(), width, length);
        //Method from the graphics class
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

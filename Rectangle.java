package paint;

import java.awt.*;

public class Rectangle extends Figure {


    public Rectangle(Color c, Point p) {
        super(c, p);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB){
        lenght=heightBB;
        width=widthBB;
    }

    @Override
    public void draw(Graphics g) {

    }
}

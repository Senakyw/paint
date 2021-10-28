package paint;

import java.awt.*;

public class Ellipse extends Figure {

    protected int semiAxysX =0, semiAxysY= 0;

    public Ellipse(Color c, Point p) {
        super(c, p);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        semiAxysX = heightBB/2;
        semiAxysY = widthBB/2;
    }

    @Override
    public void draw(Graphics g) {

    }
}

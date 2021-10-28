package paint;

import java.awt.*;

public class Circle extends Ellipse{

    public Circle(Color c, Point p) {
        super(c, p);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
        if(heightBB>widthBB){
            semiAxysX=heightBB;
        }
        else{
            semiAxysY=heightBB;
        }
    }

}

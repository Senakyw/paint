package paint;

import java.awt.*;

public class Square extends Rectangle {

    public Square(Color c, Point p) {
        super(c, p);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        super.setBoundingBox(heightBB, widthBB);
        if(heightBB>widthBB){
            width=heightBB;
        }
        else{
            lenght=heightBB;
        }
    }
}

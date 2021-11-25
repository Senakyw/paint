package paint;

import java.awt.*;
import java.io.Serializable;

public class Circle extends Ellipse implements Serializable {

    public Circle(int px, int py, Color c) {
        super(px,py,c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB,Point dragPoint) {
        //super.setBoundingBox(heightBB, widthBB);
        if(Math.abs(heightBB)>Math.abs(widthBB)){
            semiAxysX = Math.abs(heightBB);
            semiAxysY = Math.abs(heightBB);
        }
        else{
            semiAxysX = Math.abs(widthBB);
            semiAxysY = Math.abs(widthBB);
        }

        if(heightBB<0 && widthBB>0){// haut/droite
            newOrigin = new Point(p.getX(), dragPoint.getY());
        }
        else if(heightBB<0 && widthBB<0){// haut/gauche
            newOrigin = new Point(dragPoint.getX(), dragPoint.getY());
        }
        else if(heightBB>0 && widthBB<0){// bas/gauche
            newOrigin = new Point(dragPoint.getX(), p.getY());
        }
        else if(heightBB>0 && widthBB>0){// bas/gauche
            newOrigin = new Point(p.getX(), p.getY());
        }

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
                '}';
    }
}

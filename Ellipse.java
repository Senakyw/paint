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
    public void setBoundingBox(int heightBB, int widthBB, Point dragPoint) {


        if(heightBB<0 && widthBB>0){// haut/droite
            newOrigin = new Point(p.getX(), dragPoint.getY());
            semiAxysY = Math.abs(heightBB);
            semiAxysX = Math.abs(widthBB);
        }
        else if(heightBB<0 && widthBB<0){// haut/gauche
            newOrigin = new Point(dragPoint.getX(), dragPoint.getY());
            semiAxysY = Math.abs(heightBB);
            semiAxysX = Math.abs(widthBB);
        }
        else if(heightBB>0 && widthBB<0){// bas/gauche
            newOrigin = new Point(dragPoint.getX(), p.getY());
            semiAxysY = Math.abs(heightBB);
            semiAxysX = Math.abs(widthBB);
        }
        else if(heightBB>0 && widthBB>0){// bas/gauche
            newOrigin = new Point(p.getX(), p.getY());
            semiAxysY = Math.abs(heightBB);
            semiAxysX = Math.abs(widthBB);
        }


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

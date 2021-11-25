package paint;

import java.awt.*;
import java.io.Serializable;

public class Square extends Rectangle implements Serializable {

    public Square(int px, int py,Color c) {
        super(px,py,c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB, Point dragPoint) {

        if (Math.abs(heightBB) > Math.abs(widthBB) ){
            width = Math.abs(heightBB);
            length = Math.abs(heightBB);
        } else {
            length = Math.abs(widthBB);
            width = Math.abs(widthBB);
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

package paint;

import java.awt.*;
import java.io.Serializable;

public class Rectangle extends Figure implements Serializable {
    protected int width =0, length = 0;

    public Rectangle(int px, int py,Color c) {
        super(new Point(px,py), c);
        newOrigin = new Point();
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB, Point dragPoint) {

        if(heightBB<0 && widthBB>0){// haut/droite
            newOrigin = new Point(p.getX(), dragPoint.getY());
            length = Math.abs(heightBB);
            width = Math.abs(widthBB);
        }
        else if(heightBB<0 && widthBB<0){// haut/gauche
            newOrigin = new Point(dragPoint.getX(), dragPoint.getY());
            length = Math.abs(heightBB);
            width = Math.abs(widthBB);
        }
        else if(heightBB>0 && widthBB<0){// bas/gauche
            newOrigin = new Point(dragPoint.getX(), p.getY());
            length = Math.abs(heightBB);
            width = Math.abs(widthBB);
        }
        else if(heightBB>0 && widthBB>0){// bas/gauche
            newOrigin = new Point(p.getX(), p.getY());
            length = Math.abs(heightBB);
            width = Math.abs(widthBB);
        }

    }
    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(newOrigin.getX(), newOrigin.getY(), width, length);

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

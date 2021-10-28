package paint;

import javax.swing.*;
import java.awt.*;

public class RectangleTest {
    public static void main(String[] args){
        Point l = new Point();
        System.out.println(l);

        Rectangle r = null;
        System.out.println(r);

        Color c = Color.RED;

        l = new Point(10,15);
        r = new Rectangle(c, l);

        System.out.println(l);
        System.out.println(r);
    }
}
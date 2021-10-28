package paint;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Draw extends JPanel {
    private Color c = null;
    private Figure b = null;
    private ArrayList<Figure> figureList = null;

    public Draw(Color c, Figure b) {
        this.c = c;
        this.b = b;
        figureList.add(b);
    }

}

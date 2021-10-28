package paint;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(String Title, int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.white);

        Container contentPanel = this.getContentPane();

        JMenuBar m = new JMenuBar();
        this.setJMenuBar(m);
        JMenu menu1 = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        menu1.add(open);
        JMenuItem nw = new JMenuItem("New");
        menu1.add(nw);
        JMenuItem save = new JMenuItem("Save");
        menu1.add(save);
        JMenuItem quit = new JMenuItem("Quit");
        menu1.add(quit);
        m.add(menu1);

        JMenu propros = new JMenu("A propros");
        m.add(propros);

        JPanel southPanel = new JPanel();
        contentPanel.add(southPanel, "South");

        southPanel.setLayout(new GridLayout(1,2));

        JButton noir = new JButton("Noir");
        southPanel.add(noir);
        noir.setBackground(Color.black);
        noir.setForeground(Color.WHITE);

        JButton rouge = new JButton("Rouge");
        southPanel.add(rouge);
        rouge.setBackground(Color.red);

        JButton vert = new JButton("Vert");
        southPanel.add(vert);
        vert.setBackground(Color.green);

        JButton bleu = new JButton("Bleu");
        southPanel.add(bleu);
        bleu.setBackground(Color.blue);
        bleu.setForeground(Color.WHITE);

        JButton ellipse = new JButton("Ellipse");
        southPanel.add(ellipse);

        JButton cercle = new JButton("Cercle");
        southPanel.add(cercle);

        southPanel.setLayout(new GridLayout(2,1));

        JButton jaune = new JButton("Jaune");
        southPanel.add(jaune);
        jaune.setBackground(Color.yellow);

        JButton rose = new JButton("Rose");
        southPanel.add(rose);
        rose.setBackground(Color.pink);

        JButton magenta = new JButton("Magenta");
        southPanel.add(magenta);
        magenta.setBackground(Color.magenta);

        JButton orange = new JButton("Orange");
        southPanel.add(orange);
        orange.setBackground(Color.orange);

        JButton rectangle = new JButton("Rectangle");
        southPanel.add(rectangle);

        JButton carre = new JButton("Carre");
        southPanel.add(carre);

        //contentPanel.add(southPanel, "South");

        this.setVisible(true);
    }

    public static void main(String args[]){
        Window win = new Window("Paint",800,600);
    }


}

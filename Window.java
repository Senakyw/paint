package paint;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;

public class Window extends JFrame implements ActionListener, Serializable {
    Drawing Draw = new Drawing();

    public Window(String Title, int x, int y) {
        super(Title);
        this.setSize(x, y);
        //this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setBackground(Color.white);

        Container contentPanel = this.getContentPane();
        contentPanel.add(Draw);

        JMenuBar m = new JMenuBar();
        this.setJMenuBar(m);
        JMenu menu1 = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        menu1.add(open);
        JMenuItem nw = new JMenuItem("New");
        menu1.add(nw);
        JMenuItem save = new JMenuItem("Save");
        menu1.add(save);
        save.addActionListener(this);
        JMenuItem quit = new JMenuItem("Quit");
        menu1.add(quit);
        quit.addActionListener(this);
        m.add(menu1);

        JMenu propros = new JMenu("A propros");
        JMenuItem Auteur = new JMenuItem("Auteur");
        propros.add(Auteur);
        m.add(propros);
        Auteur.addActionListener(this);

        JPanel southPanel = new JPanel();
        contentPanel.add(southPanel, "South");

        southPanel.setLayout(new GridLayout(1, 2));

        JButton noir = new JButton("Noir");
        southPanel.add(noir);
        noir.setBackground(Color.black);
        noir.setForeground(Color.WHITE);
        noir.addActionListener(this);

        JButton rouge = new JButton("Rouge");
        southPanel.add(rouge);
        rouge.setBackground(Color.red);
        rouge.addActionListener(this);


        JButton vert = new JButton("Vert");
        southPanel.add(vert);
        vert.setBackground(Color.green);
        vert.addActionListener(this);

        JButton bleu = new JButton("Bleu");
        southPanel.add(bleu);
        bleu.setBackground(Color.blue);
        bleu.setForeground(Color.WHITE);
        bleu.addActionListener(this);


        JButton ellipse = new JButton("Ellipse");
        southPanel.add(ellipse);
        ellipse.addActionListener(this);

        JButton cercle = new JButton("Cercle");
        southPanel.add(cercle);
        cercle.addActionListener(this);

        southPanel.setLayout(new GridLayout(2, 1));

        JButton jaune = new JButton("Jaune");
        southPanel.add(jaune);
        jaune.setBackground(Color.yellow);
        jaune.addActionListener(this);

        JButton rose = new JButton("Rose");
        southPanel.add(rose);
        rose.setBackground(Color.pink);
        rose.addActionListener(this);

        JButton magenta = new JButton("Magenta");
        southPanel.add(magenta);
        magenta.setBackground(Color.magenta);
        magenta.addActionListener(this);

        JButton orange = new JButton("Orange");
        southPanel.add(orange);
        orange.setBackground(Color.orange);
        orange.addActionListener(this);

        JButton rectangle = new JButton("Rectangle");
        southPanel.add(rectangle);
        rectangle.addActionListener(this);

        JButton carre = new JButton("Carre");
        southPanel.add(carre);
        carre.addActionListener(this);

        //contentPanel.add(southPanel, "South");

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        switch (cmd) {

            case "Noir":
                Draw.setColor(Color.black);
                break;
            case "Rouge":
                Draw.setColor(Color.red);
                break;
            case "Vert":
                Draw.setColor(Color.green);
                break;
            case "Bleu":
                Draw.setColor(Color.blue);
                break;
            case "Jaune":
                Draw.setColor(Color.yellow);
                break;
            case "Rose":
                Draw.setColor(Color.pink);
                break;
            case "Magenta":
                Draw.setColor(Color.magenta);
                break;
            case "Orange":
                Draw.setColor(Color.orange);
                System.out.println("Orange");
                break;
            case "Ellipse":
                Draw.setNameFigure("Ellipse");
                break;
            case "Cercle":
                Draw.setNameFigure("Cercle");
                break;
            case "Rectangle":
                Draw.setNameFigure("Rectangle");
                break;
            case "Carre":
                System.out.println("carre");
                Draw.setNameFigure("Carre");
                break;
            case "Auteur":
                JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog(info, "      Author : Lavan", "information", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Save":
                Draw.save();
                break;

            case "Quit":
                System.exit(0);
                break;


        }
    }
}

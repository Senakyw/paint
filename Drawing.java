package paint;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;


public class Drawing extends JPanel implements MouseMotionListener, MouseListener, Serializable {
    private Color color = null;
    private ArrayList<Figure> figureList;
    private String nameFigure;
    private int width, height;
    Figure fig;
    Point dragPoint;


    public Drawing() {
        super();
        this.setBackground(Color.white);
        color = Color.black;
        figureList = new ArrayList<Figure>();
        nameFigure = "Rectangle";
        //fig = null;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        width = e.getX() - fig.p.getX();
        height = e.getY() - fig.p.getY();
        dragPoint = new Point(e.getX(), e.getY());
        fig.setBoundingBox(height, width, dragPoint);
        repaint();
    }


    @Override
    public void mouseMoved(MouseEvent e) {
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        switch (nameFigure) {
            case "Ellipse":
                figureList.add(fig = new Ellipse(e.getX(), e.getY(), color));
                System.out.println("ellipse cree");
                break;

            case "Cercle":
                figureList.add(fig = new Circle(e.getX(), e.getY(), color));
                System.out.println("cercle cree");
                break;

            case "Rectangle":
                figureList.add(fig = new Rectangle(e.getX(), e.getY(), color));
                //fig.p = new Point(e.getX(), e.getY());
                System.out.println("rectangle cree");
                break;

            case "Carre":
                figureList.add(fig = new Square(e.getX(), e.getY(), color));
                System.out.println("carre cree");
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figure f : figureList) {
            f.draw(g);
            System.out.println(f);
        }
    }

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("mondessin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(figureList.size());
            System.out.println(figureList.size());
            for(Figure f : figureList){
                oos.writeObject(f);
            }
            oos.close();

        } catch (Exception e) {
            System.out.println("Impossible de sauvegarder");
        }


        /*try {
            FileOutputStream output = new FileOutputStream("FileName");
            ObjectOutputStream objectOutput = new ObjectOutputStream(output);
            objectOutput.writeObject(figureList);
            objectOutput.close();
            System.out.println("\nSaved\n");
        } catch (Exception e) {
            System.out.println("The file could not be saved");
            e.printStackTrace();
        }*/



    }
}


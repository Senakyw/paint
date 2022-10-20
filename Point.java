package paint;

public class Point {
    private int x;
    private int y;

    //Constructeur
    public Point() {
        x= 0;
        y= 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Méthode
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return (x+","+y);
    }
}
//
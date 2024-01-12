package TDS_POO.TD3.EXo1;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affiche() {

        System.out.println("Coordonnées du point : (" + x + ", " + y + ")");
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


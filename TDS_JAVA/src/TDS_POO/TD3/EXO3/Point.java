package TD3.EXO3;

public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Les Coordonnees du point: " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Les Coordonnees : " + x + " " + y);
    }
}

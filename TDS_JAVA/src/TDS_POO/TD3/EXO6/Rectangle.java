package TD3.EXO6;

public class Rectangle extends TD3.EXO6.Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {
        super("Rectangle");
        this.longueur = 1;
        this.largeur = 1;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getArea() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return super.toString() + " - Longueur: " + longueur + ", Largeur: " + largeur;
    }
}

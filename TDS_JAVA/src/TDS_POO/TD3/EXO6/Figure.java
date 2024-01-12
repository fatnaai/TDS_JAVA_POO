package TD3.EXO6;


public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public String toString() {
        return nom;
    }
}


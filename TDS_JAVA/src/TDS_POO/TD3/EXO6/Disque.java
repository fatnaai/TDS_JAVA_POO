package TD3.EXO6;
import TD3.EXO6.Figure;

public class Disque extends Figure {
    private double[] centre;
    private double rayon;

    public Disque() {
        super("Disque");
        this.centre = new double[]{0, 0};
        this.rayon = 1;
    }

    public Disque(double[] centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(double[] centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " Le Centre est: [" + centre[0] + ", " + centre[1] + "], et Le Rayon est : " + rayon;
    }
}
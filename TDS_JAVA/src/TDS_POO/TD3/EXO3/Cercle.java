package TD3.EXO3;

public class Cercle extends TD3.EXO3.Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Le rayon est : " + rayon);
    }
}

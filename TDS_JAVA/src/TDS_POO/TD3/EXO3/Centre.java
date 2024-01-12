package TD3.EXO3;

import java.awt.*;

public class Centre extends Point {
    private char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("nom  : " + nom);
    }

    public void affiche() {
        super.affiche();
        affNom();
    }

}

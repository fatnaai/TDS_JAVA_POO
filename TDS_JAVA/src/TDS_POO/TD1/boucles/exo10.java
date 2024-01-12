package TDS_POO.TD1.boucles;

public class exo10 {
    public static void main(String[] args) {
        // Initialisation des variables
        int min = 100;
        int max = 999;

        // Boucle principale
        for (int i = min; i <= max; i++) {
            // Vérification si le nombre est cubique
            int n = i;
            int somme = 0;
            while (n > 0) {
                somme += Math.pow(n % 10, 3);
                n /= 10;
            }
            if (somme == i) {
                // Affichage du nombre
                System.out.println(i);
            }
        }
    }
}

package TDS_POO.TD1.boucles;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nombre de lignes : ");
        int n = s.nextInt();

        // Boucle principale
        for (int i = 1; i <= n; i++) {
            // Affichage du nombre
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

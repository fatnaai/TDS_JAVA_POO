package TDS_POO.TD1.boucles;

import java.util.Scanner;

public class exo8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nombre d'étoiles : ");
        int n = s.nextInt();

        // Boucle principale
        for (int i = 0; i < n; i++) {
            // Affichage des étoiles
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Affichage des espaces
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
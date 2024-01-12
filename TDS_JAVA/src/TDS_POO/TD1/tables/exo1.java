package TDS_POO.TD1.tables;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Initialisation des variables
        System.out.print("Taille du tableau : ");
        int n = s.nextInt();
        int[] T = new int[n];

        // Saisie des éléments du tableau
        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = s.nextInt();
        }

        // Recherche de la valeur maximale
        int max = T[0];
        for (int i = 1; i < n; i++) {
            if (T[i] > max) {
                max = T[i];
            }
        }

        // Recherche de la valeur minimale
        int min = T[0];
        for (int i = 1; i < n; i++) {
            if (T[i] < min) {
                min = T[i];
            }
        }

        // Affichage des valeurs extrêmes
        System.out.println("Valeur maximale : " + max);
        System.out.println("Valeur minimale : " + min);
    }
}

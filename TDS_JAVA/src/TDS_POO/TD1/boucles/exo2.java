package TDS_POO.TD1.boucles;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre : ");
        int n = input.nextInt();

        // Initialisation de la somme
        int somme = 0;

        // Calcul de la somme des entiers impairs inférieurs à N
        for (int i = 1; i < n; i += 2) {
            somme += i;
        }

        // Affichage de la somme
        System.out.println("La somme des entiers impairs inférieurs à " + n + " est " + somme);
    }
}


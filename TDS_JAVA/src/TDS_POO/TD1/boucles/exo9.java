package TDS_POO.TD1.boucles;

import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nombre : ");
        int n = s.nextInt();

        // Initialisation de la somme
        int somme = 0;

        // Calcul de la somme des chiffres
        while (n > 0) {
            somme += n % 10;
            n /= 10;
        }

        // Affichage de la somme
        System.out.println("La somme des chiffres de " + n + " est " + somme);
    }
}


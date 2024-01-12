package TDS_POO.TD1.condition;

import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numéro du mois : ");
        int mois = input.nextInt();

        System.out.print("Année : ");
        int annee = input.nextInt();

        // Tableau des nombres de jours par mois
        int[] jours = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Vérification de l'année bissextile
        boolean bissextile = (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;

        // Affichage du nombre de jours
        if (mois == 2 && bissextile) {
            System.out.println("Le mois " + mois + " de l'année " + annee + " a 29 jours");
        } else {
            System.out.println("Le mois " + mois + " de l'année " + annee + " a " + jours[mois - 1] + " jours");
        }
    }
}

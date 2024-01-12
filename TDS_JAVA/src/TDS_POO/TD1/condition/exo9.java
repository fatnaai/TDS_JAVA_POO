package TDS_POO.TD1.condition;

import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Première variable : ");
        int a = input.nextInt();
        System.out.print("Deuxième variable : ");
        int b = input.nextInt();

        // Si la première variable est supérieure à la deuxième variable
        if (a > b) {
            // On échange les valeurs des deux variables
            int temp = a;
            a = b;
            b = temp;
        }

        // Affichage des deux variables dans l'ordre croissant
        System.out.println("Les deux variables dans l'ordre croissant sont : " + a + " " + b);
    }
}

package TDS_POO.TD1.condition;

import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre de trois chiffres non nuls : ");
        int n = input.nextInt();

        // Vérification que le nombre est de trois chiffres non nuls
        if (n < 100 || n > 999) {
            System.out.println("Le nombre doit être de trois chiffres non nuls");
            return;
        }

        // Extraction des chiffres du nombre
        int c1 = n / 100;
        int c2 = (n % 100) / 10;
        int c3 = n % 10;

        // Calcul de tous les nombres possibles
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        // Affichage du nombre
                        System.out.println(c1 * 100 + c2 * 10 + c3);
                    }
                }
            }
        }
    }
}


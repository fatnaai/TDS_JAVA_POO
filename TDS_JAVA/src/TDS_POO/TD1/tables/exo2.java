package TDS_POO.TD1.tables;

import java.util.Scanner;

public class exo2 {

        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);

            // Saisie de l'entier
            System.out.print("Entier : ");
            int n =s.nextInt();

            // Affichage de la représentation binaire
            System.out.println("Représentation binaire : ");
            for (int i = 31; i >= 0; i--) {
                System.out.print((n & (1 << i)) > 0 ? "1" : "0");
            }
            System.out.println();
        }
    }


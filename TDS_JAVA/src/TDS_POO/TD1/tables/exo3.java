package TDS_POO.TD1.tables;

import java.util.Scanner;

public class exo3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            // Initialisation des variables
            System.out.print("Nombre d'étudiants : ");
            int n = s.nextInt();
            double[] moyennes = new double[n];
            double seuil = 0;

            // Saisie des moyennes
            for (int i = 0; i < n; i++) {
                System.out.print("Moyenne de l'étudiant " + i + " : ");
                moyennes[i] = s.nextDouble();
            }

            // Saisie du seuil
            System.out.print("Seuil : ");
            seuil = s.nextDouble();

            // Calcul du nombre d'étudiants
            int nb = 0;
            for (int i = 0; i < n; i++) {
                if (moyennes[i] >= seuil) {
                    nb++;
                }
            }

            // Affichage du nombre d'étudiants
            System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est " + nb);
        }
    }



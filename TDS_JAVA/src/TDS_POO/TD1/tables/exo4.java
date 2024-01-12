package TDS_POO.TD1.tables;
import java.util.Scanner;
public class exo4 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            // Initialisation des variables
            System.out.print("Taille de la matrice 1 : ");
            int n = s.nextInt();
            System.out.print("Taille de la matrice 2 : ");
            int m = s.nextInt();
            double[][] A = new double[n][n];
            double[][] B = new double[m][m];

            // Saisie de la matrice 1
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = s.nextDouble();
                }
            }

            // Saisie de la matrice 2
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    B[i][j] = s.nextDouble();
                }
            }

            // Calcul de la somme des matrices
            double[][] C = new double[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }}}


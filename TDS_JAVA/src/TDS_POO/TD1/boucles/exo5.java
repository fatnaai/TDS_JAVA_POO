package TDS_POO.TD1.boucles;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nombre : ");
        int n = s.nextInt();

        // Initialisation des deux premiers termes de la suite
        int f0 = 0;
        int f1 = 1;

        // Calcul du nème terme de la suite
        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        // Affichage du nème terme de la suite
        System.out.println("Le " + n + "ème terme de la suite de Fibonacci est " + f1);
    }
}

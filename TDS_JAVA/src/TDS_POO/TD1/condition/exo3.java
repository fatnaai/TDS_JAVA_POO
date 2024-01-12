package TDS_POO.TD1.condition;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer la valeur de a:");
        int a = s.nextInt();
        System.out.println("entrer la valeur de b:");
        int b = s.nextInt();
        System.out.println("veuillez choisir une opetaion :\n"
                + "1-de savoir si la somme de a+b est pair;\n"
                + "2-de savoir si le produit ab est pair \n"
                + "3-de connaître le signe du somme a+b \n"
                + "4 -de connaître le signe du produit ab.\n ");

              int choix = s.nextInt();
                switch (choix) {
                    case 1:
                        if ((a + b) % 2 == 0) {
                            System.out.println("la somme est paire");
                        } else
                            System.out.println("la somme est impaire");
                        break;
                    case 2:
                        if ((a * b) % 2 == 0) {
                            System.out.println("le produit est paire");
                        } else {
                            System.out.println("le produit est impaire");
                        }

                        break;
                    case 3:
                        if ((a + b) > 0) System.out.println("le sommme est positive");
                        else System.out.println("le somme est negative");
                        break;
                    case 4:
                        if ((a * b) > 0)
                        {
                            System.out.println("le produit est positif");
                        }
                        else System.out.println("le produit est negatif ");
                        break;
                    default:
                        System.out.println("Done");


                }
    }
}
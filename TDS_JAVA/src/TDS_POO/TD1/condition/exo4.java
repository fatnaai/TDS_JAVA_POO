package TDS_POO.TD1.condition;

import java.util.Scanner;;

    public class exo4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moyenne de l'étudiant ");
            int m = scanner.nextInt();
            System.out.println("mention: ");
            if (m>=16) System.out.println("Tres Bien");
            else if (m>= 14) System.out.println("Bien");
            else if (m>= 12) System.out.println("Assez bien");
            else if (m>=10) System.out.println("Passable");
            else System.out.println("NV");
        }
    }


package TDS_POO.TD1.condition;
import java.util.Scanner;
public class exo6 {

    public class SigneProduit {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Premier nombre : ");
            int a = input.nextInt();
            System.out.print("Deuxième nombre : ");
            int b = input.nextInt();

            // Si les deux nombres ont le même signe, le produit est positif
            if (a * b >= 0) {
                System.out.println("Le signe du produit est positif");
            } else {
                // Sinon, le produit est négatif
                System.out.println("Le signe du produit est négatif");
            }
        }
    }
}

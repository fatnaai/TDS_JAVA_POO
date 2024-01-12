package TDS_POO.TD1.condition;
import java.util.Scanner;
public class exo2 {
    public static void main (String [] args){
        Scanner s= new Scanner (System.in);
        System.out.println("entrer a :");
        int a =s.nextInt();
        System.out.println("entrer b :");
        int b=s.nextInt();
        System.out.println("entrer c:");
        int c =s.nextInt();
        int d=b*b-4*a*c;
        if(d==0){
            System.out.println("X="+(-b/2*a));
        }
        else
        if(d>0){
            System.out.println("X1="+((-b+Math.sqrt(d))/2*a));
            System.out.println("X1="+((-b-Math.sqrt(d))/2*a));
        }
        else if (d<0) {
            System.out.println("Equation pas de solution");
        }


    }
}

package TDS_POO.TD1.condition;

import java.util.Scanner;

public class exo1 {
    public static  void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Donnez la valeur de a :");
        int a = s.nextInt();
        System.out.println("Donnez la valeur de b:");
        int b = s.nextInt();
        System.out.println("Donnez la valeur de c :");
        int c = s.nextInt();
        int max=Math.max(a,b);
        max=Math.max(max,c);
        System.out.println("le max est :" +max);
    }
}

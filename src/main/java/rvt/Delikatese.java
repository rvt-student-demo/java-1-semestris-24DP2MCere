package rvt;

import java.util.Scanner;

public class Delikatese {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;

        System.out.print("Ievadiet preci: ");  
        String prece = reader.nextLine();

        System.out.print("Ievadi cenu: "); 
        double price = reader.nextDouble();

        System.out.print("Ekspress piegade (ja == 1 vai ne == 0): ");
        double Ekspress = reader.nextDouble() ;

        double piegade = 0 ;

        if (price < 10) {
            piegade += 2 ;
        }
        if (Ekspress == 1) {
            piegade += 3 ;
        }
        double summa = price + piegade ;

        System.out.println("Rekins : ");
        System.out.println("   " + prece + "   " + price);
        System.out.println("   Piegade   " + piegade);
        System.out.println("   Kopa:     " + summa);



        }
}

package rvt;
    import java.util.*;
public class GiftTax {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int atk = 0;
        while (atk < 1) {
            System.out.println("Value of the gift?");
            int cipars = reader.nextInt();
            if (cipars < 5000) {
                System.out.println("No tax!");
            }else if (cipars == 5000 || cipars < 25000) {
                double tax = (100 +(cipars - 5000) * 0.08);
                System.out.println("Tax:" + tax);
            }else if (cipars == 25000 || cipars < 55000) {
                double tax = (1700 + (cipars - 25000) * 0.1);
                System.out.println("Tax:" + tax);
            }else if (cipars == 55000 || cipars < 200000) {
                double tax = (4700 + (cipars - 55000) * 0.12);
                System.out.println("Tax:" + tax);
            }else if (cipars == 200000 || cipars < 1000000) {
                double tax = (22100 + (cipars - 200000) * 0.15);
                System.out.println("Tax:" + tax);
            }else if (cipars >= 1000000) {
                double tax = (142000 + (cipars - 1000000) * 0.17);
                System.out.println("Tax:" + tax);
            } 
            atk ++ ;
        }
    }
}

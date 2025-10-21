package rvt;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
    
     Scanner reader = new Scanner(System.in);
    Random random = new Random();

    int result = random.nextInt(10) + 1;

    System.out.println("Es domaju par skaitli no 1 lidz 10");
    System.out.println("Ievadi minejumu: ");

    int guestammount = 0;
    while (guestammount < 3) {
      int minejums = reader.nextInt();
      if (minejums == result) {
        System.out.println("Pareizi!!");
        System.out.println("Tu esi uzvarej speli.");
        break ;
      } else {
        System.out.println("nepareizi");
      }
      guestammount++;
      if (guestammount == 3) {
        System.out.println("Pareizais skaitli bija " + result);
        System.out.println("Tu esi zaudejis speli");
      }
    }
 }
}

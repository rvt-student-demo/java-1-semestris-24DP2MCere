package rvt;
import java.util.Scanner;
public class Pasutijuma_parbaude {
    public static void main(String[]args){
         Scanner reader = new Scanner(System.in);

        final int price1 = 5;
        final int price2 = 3;
        final int price3 = 1;

         System.out.println("Ievadiet skruvju skaitu");
         int skruvi = reader.nextInt();
         System.out.println("Ievadiet uzgrieznu skaitu");
         int uzgriezni = reader.nextInt();
         System.out.println("Ievadiet paplaksnu skaitu");
         int paplaksne = reader.nextInt();

         int kop_cena = skruvi*price1+uzgriezni*price2+paplaksne*price3;

         if (skruvi > uzgriezni){
            System.out.println("Pa maz uzgrieznu");
         }else if(uzgriezni > skruvi){
            System.out.println("Pa maz skruvju");
         }else if(paplaksne*2 < skruvi){
            System.out.println("Pa maz paplaksnu");
         }else {
            System.out.println("Pasutijums ir kartiba");
         }

         System.out.println("Kopeja cena ir: "+ kop_cena);




    }
    
}

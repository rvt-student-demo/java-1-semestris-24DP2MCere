package rvt;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Lietotajs_uzd {
    
    public static void main(String[] args){

    Scanner reader = new Scanner(System.in);

    System.out.println("Produkts: ");
    String product = reader.nextLine();
    

    System.out.println("Produktu skaits: ");
    Integer skaits = reader.nextInt();
    

    System.out.println("Produkta cena: ");
    Double cena = reader.nextDouble();
   
    System.out.println();
    System.out.println();
    System.out.println("Produkts: ");
    System.out.println(product);
    System.out.println("Produktu skaits: ");
    System.out.println(skaits);
    System.out.println("Produkta cena: ");
    System.out.println(cena);
    System.out.println("Total price :");
    System.out.println(skaits * cena);


    }




}

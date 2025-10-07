package rvt;
import java.util.Scanner;
public class Chapter_19 {
    public static void main(String[] args) {
    
        ex7();

    }

    public static void ex1(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter start number ");
        int start = reader.nextInt();
        System.out.println("Enter end number ");
        int end = reader.nextInt();
        System.out.println();
        while (start < end + 1) {
            System.out.println(start);
            start = start + 1 ;

        }

    }
    public static void ex2(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter N number ");
        int n_number = reader.nextInt();
        int summa = 0 ; 
        int formul_summa = (n_number*(n_number+1))/2 ;
        while (n_number != 0) {
            summa = summa + n_number ;
            n_number = n_number - 1 ;


        }

        System.out.println("Summa ir " + summa);
        System.out.println("Formul summa ir " + formul_summa);
    }

    public static void ex3(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter N number ");
        int n_number = reader.nextInt();
        int summa = 0 ; 
        while (n_number != 0) {
            summa = summa + n_number*n_number ;
            n_number = n_number - 1 ;
        }
        System.out.println(summa);
    }
    public static void ex4(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter low ");
        int low_num = reader.nextInt();

        System.out.println("Enter high ");
        int high_num = reader.nextInt();
        
        int summa = 0 ;
        while (low_num != high_num + 1) {
            summa = summa + low_num ;
            low_num = low_num + 1 ;


        }
        System.out.print("Summa: " + summa);

    }
    public static void ex5(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word ");
        String word = reader.nextLine();
        int len = word.length();
        System.out.println();
        while (len > 0) {
            System.out.println(word);
            len = len - 1 ;
        }
    }   
    public static void ex6(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first word ");
        String word = reader.nextLine();
        System.out.println("Enter second word ");
        String word2 = reader.nextLine();
        int dotAmount = 30 - word.length() - word2.length();
        String dots = "";
        for (int i = 1; i < dotAmount; i++) {
            dots += ".";
        }
        System.out.println(word + dots + word2);
    }
    public static void ex7(){
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int len = word.length();
        for (int index = 0; index < len; index++) {
            System.out.println(word.charAt(index));
        }

    }




}

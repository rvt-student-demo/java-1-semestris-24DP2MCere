package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
}

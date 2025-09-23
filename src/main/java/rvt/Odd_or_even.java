package rvt;
import java.util.Scanner;
public class Odd_or_even {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = reader.nextInt();
        

        if (number % 2 == 0){
            System.out.println("Number "+ number +" is even");

        }else{
            System.out.println("Number "+ number +" is odd");
        }


    }

}

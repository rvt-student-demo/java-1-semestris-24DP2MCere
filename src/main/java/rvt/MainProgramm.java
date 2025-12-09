package rvt;
import java.util.*;
public class MainProgramm {
    public static void main(String[] args) {
    int number = 0 ; 
    int sum = 0;
    int evensum = 0; 
    int oddsum = 0;
    System.out.println("Enter numbers");
    Scanner reader = new Scanner(System.in);
    while (true) {
        number = reader.nextInt();
        if (number == -1) {
            break ;
        }
        sum += number ; 
        
        if (number % 2 == 0) {
            evensum += number;
        }
        else{
            oddsum += number;
        }
    }
    System.out.println("Sum is : " + sum);
    System.out.println("Even sum is : " + evensum);
    System.out.println("Odd sum is : " + oddsum);


    }
}

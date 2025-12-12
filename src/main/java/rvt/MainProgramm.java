package rvt;
 import java.util.*;
 public class MainProgram {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int number = Integer.valueOf(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum.addNumber(number);
            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
    }
}
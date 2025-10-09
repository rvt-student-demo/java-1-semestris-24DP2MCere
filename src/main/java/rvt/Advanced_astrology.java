package rvt;

public class Advanced_astrology {
    public static void main(String[] args){
    printTriangle(10);
    
    }
    public static void printSpaces(int number){
        for (int i = 0; i < number ; i++) {
            System.out.print(" ");
        }
        
    }
    public static void printStars(int number){
        for (int i = 0; i < number; i++) {
            System.out.print("*");
            
        }
        System.out.println();
    }
    public static void printTriangle(int height){
        for (int i = 1; i < height + 1; i ++) {
            printSpaces(height - i  );
            printStars(i * 2 - 1);

        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3 );
            
        }
    }
}

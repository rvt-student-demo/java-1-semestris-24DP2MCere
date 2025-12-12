import java.util.*;

public class ConCurssChapter44 {

    public static void main(String[] args) {
        ex1(args);
    }

    public static void ex1(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String all = reader.nextLine().trim();// read the whole line and remove spaces

        int spaceIndex = all.indexOf(" ");

        String fr = all.substring(0, spaceIndex);

        String ls = all.substring(spaceIndex + 1);

        ls = ls.toUpperCase();

        System.out.println();
        System.out.println(fr + " " + ls);

    }

    public static void ex2(String[] args) {
        System.out.println("Enter a string: ");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void ex3(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> females = new ArrayList<String>();
        females.add("Amy");
        females.add("Buffy");
        females.add("Cathy");
        ArrayList<String> males = new ArrayList<String>();
        males.add("Elroy");
        males.add("Fred");
        males.add("Graham");
        while (true) {
        System.out.println("Enter a name: ");
        String name = reader.nextLine().trim();
            if (name.equals("")) {
                break;
                }
            int spaceIndex = name.indexOf(" ");
            String firstName = name.substring(0, spaceIndex);
                System.out.println();
            if (males.contains(firstName)) {
                System.out.println("Mrs. " + name);
            } else if (females.contains(firstName)) {
                System.out.println("Ms. " + name);
            } else {
                System.out.println(name);
            }
        }
    }
    public static void ex4(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        String digits = reader.nextLine().trim();

        int leng = digits.length();
        String min;
        String sec;

        if (leng <= 2) {
            min = "0";
            sec = digits;
            if (sec.length() == 1) {
                sec = "0" + sec;
            }
        } else {
            sec = digits.substring(leng - 2);
            min = digits.substring(0, leng - 2);
        }

        System.out.println("Your time->  " + min + ":" + sec);
    }
    public static void ex6(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter password : ");
            String pasword = reader.nextLine();
            boolean IsLong = pasword.length() >= 7;
            boolean UpperCase = !pasword.toUpperCase().equals(pasword);// ! negates the condition
            boolean LowerCase = !pasword.toLowerCase().equals(pasword);
            boolean HaveDigit = false;
            for (int i = 0; i < pasword.length(); i++) {
                if (Character.isDigit(pasword.charAt(i))) {
                    HaveDigit = true;
                    break;
                }
            }
            if (IsLong) {
                    if (UpperCase) {
                     if (LowerCase) {
                    if (HaveDigit) {
                         System.out.println("That password is acceptable.");
                         break;
                        }
                    }
                }
            }
            System.out.println("That password is not acceptable.\n");
        }

    }
    public static void ex7(String[] args) {
        System.out.print("Enter a word -->");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int helper = 0;
        for (int i = 0; i < word.length() - i; i++) {
            printSpaces(i);
            System.out.print(word.substring(helper, word.length() - i));
            System.out.println();
            helper++;
        }
    }
         public static void printSpaces(double number) {
            for (int i = 0; i < number; i++) {
              System.out.print(" ");
        }
    }
}

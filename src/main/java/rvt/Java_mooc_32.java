package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_mooc_32 {
  public static void main(String[] args) {
    RemoveLast(null);
  }

  public static void onlyTheseNumbers() {
    Scanner reader = new Scanner(System.in);
    int[] array = { 72, 2, 8, 11, -1 };

    System.out.print("From where ? ");
    int number = reader.nextInt();
    System.out.print("To where ? ");
    int number2 = reader.nextInt();
    for (int i = number; i < number2 + 1; i++) {
      System.out.println(array[i]);
    }
  }

  public static void ListSize() {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> saraksts = new ArrayList<>();
    String name = "";
    int sk = 0;
    while (true) {
      name = reader.nextLine();
      if (name == "") {
        break;
      }
      sk++;
    }
    System.out.println("Total names: " + sk);
  }

  public static void OnTheList() {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> saraksts = new ArrayList<>();
    String name = "";
    while (true) {
      name = reader.nextLine();
      if (name == "") {
        break;
      }
      saraksts.add(name);
    }
    System.out.println();
    System.out.print("Search for? ");
    String vards = reader.nextLine();
    if (saraksts.contains(vards)) {
      System.out.println(vards + " was found!");
    } else {
      System.out.println(vards + " was not found!");
    }
  }

  public static void RemoveLast(ArrayList strings) {
    strings = new ArrayList<>();
    
    strings.add("First");
    strings.add("Second");
    strings.add("Third");
    
    System.out.println(strings);
    
    removeLast(strings);
    removeLast(strings);
    
    System.out.println(strings);
    }
    
    public static void removeLast(ArrayList array) {
    int size = array.size();
    
    array.remove(size-1);
    }

}

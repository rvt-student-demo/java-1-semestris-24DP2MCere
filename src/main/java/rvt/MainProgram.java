import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        while (true) {

            System.out.print("Title: ");
            String title = reader.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(reader.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(reader.nextLine());
            books.add(new Books(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String info = reader.nextLine();
        for (Books book : books) {
            if (info.equals("everything")) {
                System.out.println(book.toString());
            } else if (info.equals("name")) {
                System.out.println(book.getTitle());
            }

        }
    }
}
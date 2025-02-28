import java.io.*;
import java.util.*;
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void populateList(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String name = parts[0];
                    int pages = Integer.parseInt(parts[1]);
                    books.add(new Book(name, pages));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

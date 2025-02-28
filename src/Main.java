import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(51);
            numbers.add(num);
        } while (num != 40);

        System.out.println("List length: " + numbers.size());
        printList(numbers);

        numbers.removeIf(n -> n % 2 == 0);
        printList(numbers);


        int[] array = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            array[i] = rand.nextInt(51);
            arrayList.add(array[i]);
        }

        printList(arrayList);

        int maxIndex = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > arrayList.get(maxIndex)) {
                maxIndex = i;
            }
        }

        System.out.println("Max number index: " + maxIndex);


        Library library = new Library();
        library.populateList("books.txt");
        library.printBooks();
    }


    public static void printList(List<Integer> list) {
        System.out.print("List of { ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if (query.equals("Insert") || query.equals("insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (query.equals("Delete") || query.equals("delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
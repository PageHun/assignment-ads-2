import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Deque<Integer> shelf = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                int disk = scanner.nextInt();
                shelf.addFirst(disk);
            } else if (command == 2) {
                int disk = scanner.nextInt();
                shelf.addLast(disk);
            } else if (command == 3) {
                System.out.println(shelf.removeFirst());
            } else if (command == 4) {
                System.out.println(shelf.removeLast());
            }
        }
    }
}
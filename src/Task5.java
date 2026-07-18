import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }
        int[] samsas = new int[n];
        for (int i = 0; i < n; i++) {
            samsas[i] = scanner.nextInt();
        }

        int result = countStudents(students, samsas);
        System.out.println(result);
    }

    public static int countStudents(int[] students, int[] samsas) {
        int count0 = 0;
        int count1 = 0;

        for (int student : students) {
            if (student == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        for (int samsa : samsas) {
            if (samsa == 0 && count0 > 0) {
                count0--;
            }
            else if (samsa == 1 && count1 > 0) {
                count1--;
            }
            else {
                break;
            }
        }
        return count0 + count1;
    }
}
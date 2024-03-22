import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sorted[] = new int[a];

        for (int i = 0; i < a; i++) {
            sorted[i] = sc.nextInt();

        }
        boolean isAscending = true;

        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] > sorted[i + 1]) {
                isAscending = false;
            }

        }

        if (isAscending) {
            System.out.println("the arrray is sorted in ascending order");
        } else {
            System.out.println("the array is not sorted in ascending order");
        }
        sc.close();
    }
}

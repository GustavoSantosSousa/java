import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("\nValores digitados:");
        for (int n : v) System.out.println(n);
    }
}

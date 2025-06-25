import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5], b = new int[5], soma = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = sc.nextInt();
            soma[i] = a[i] + b[i];
        }

        System.out.println("Vetor Soma:");
        for (int n : soma) System.out.println(n);
    }
}

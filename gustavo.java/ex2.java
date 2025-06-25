import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }

        System.out.println("\nMatriz:");
        for (int[] linha : m) {
            for (int n : linha) System.out.print(n + "\t");
            System.out.println();
        }
    }
}
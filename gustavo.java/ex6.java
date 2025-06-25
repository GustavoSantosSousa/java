import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int maiores10 = 0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
                if (m[i][j] > 10) maiores10++;
            }

        System.out.println("\nQuantidade > 10: " + maiores10);
    }
}
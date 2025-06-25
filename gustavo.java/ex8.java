import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int pares = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
                if (m[i][j] % 2 == 0) pares++;
            }

        System.out.println("Quantidade de pares: " + pares);
    }
}

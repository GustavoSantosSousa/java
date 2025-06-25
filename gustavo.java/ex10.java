import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        boolean simetrica = true;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (m[i][j] != m[j][i]) simetrica = false;

        System.out.println(simetrica ? "É simétrica" : "Não é simétrica");
    }
}

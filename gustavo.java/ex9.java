import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        int maior = Integer.MIN_VALUE, linha = 0, coluna = 0;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    linha = i;
                    coluna = j;
                }
            }

        System.out.println("Maior valor: " + maior + " em [" + linha + "][" + coluna + "]");
    }
}
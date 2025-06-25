import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos? ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i == n - 1 ? "\n" : " "));
            int aux = a + b;
            a = b;
            b = aux;
        }
    }
}

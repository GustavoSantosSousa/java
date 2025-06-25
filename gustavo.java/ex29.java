import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int div = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) div++;

        System.out.println(div == 2 ? "É primo" : "Não é primo");
    }
}
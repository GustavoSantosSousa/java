import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, positivos = 0;

        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            if (n >= 0) positivos++;
        } while (n >= 0);

        System.out.println("Positivos digitados: " + positivos);
    }
}
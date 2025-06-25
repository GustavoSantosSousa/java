import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            soma += sc.nextInt();
        }
        System.out.println("Soma = " + soma);
    }
}
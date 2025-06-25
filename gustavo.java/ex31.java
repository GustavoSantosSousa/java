import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, num;

        System.out.print("Número (0 encerra): ");
        while ((num = sc.nextInt()) != 0) {
            soma += num;
            System.out.print("Número (0 encerra): ");
        }
        System.out.println("Soma = " + soma);
    }
}
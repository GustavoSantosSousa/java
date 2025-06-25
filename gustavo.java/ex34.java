import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        double soma = 0, v;

        System.out.print("Valor (negativo encerra): ");
        while ((v = sc.nextDouble()) >= 0) {
            soma += v;
            qtd++;
            System.out.print("Valor (negativo encerra): ");
        }

        if (qtd > 0)
            System.out.printf("Média = %.2f%n", soma / qtd);
        else
            System.out.println("Nenhum valor positivo informado.");
    }
}
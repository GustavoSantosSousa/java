import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, qtd = 0, idade;

        System.out.print("Idade (0 encerra): ");
        while ((idade = sc.nextInt()) > 0) {
            soma += idade;
            qtd++;
            System.out.print("Idade (0 encerra): ");
        }

        if (qtd > 0)
            System.out.printf("Média = %.2f%n", soma / (double) qtd);
        else
            System.out.println("Nenhuma idade registrada.");
    }
}
36. Menu em while até o
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, nota;
        int qtd = 0;

        System.out.print("Nota (0-10) ou outro valor p/ sair: ");
        while ((nota = sc.nextDouble()) >= 0 && nota <= 10) {
            soma += nota;
            qtd++;
            System.out.print("Nota (0-10) ou outro valor p/ sair: ");
        }

        if (qtd > 0)
            System.out.printf("Média = %.2f%n", soma / qtd);
        else
            System.out.println("Nenhuma nota válida.");
    }
}
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("""
                1-Dizer Olá
                2-Dizer Tchau
                0-Sair""");
            op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Olá!");
                case 2 -> System.out.println("Tchau!");
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
}
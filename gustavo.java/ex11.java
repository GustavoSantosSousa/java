import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Olá\n2 - Tchau\n3 - Sair");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> System.out.println("Olá!");
            case 2 -> System.out.println("Tchau!");
            case 3 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida.");
        }
    }
}

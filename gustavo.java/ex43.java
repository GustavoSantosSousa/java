import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1- Opção 1\n2- Opção 2\n3- Opção 3\n0- Sair");
            op = sc.nextInt();
            switch (op) {
                case 1 -> System.out.println("Você escolheu a opção 1");
                case 2 -> System.out.println("Você escolheu a opção 2");
                case 3 -> System.out.println("Você escolheu a opção 3");
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Inválido");
            }
        } while (op != 0);
    }
}

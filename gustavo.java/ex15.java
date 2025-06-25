import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de saque (1-Débito, 2-Crédito, 3-Dinheiro): ");
        int tipo = sc.nextInt();

        switch (tipo) {
            case 1 -> System.out.println("Débito");
            case 2 -> System.out.println("Crédito");
            case 3 -> System.out.println("Dinheiro");
            default -> System.out.println("Código inválido");
        }
    }
}

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int op;

        do {
            System.out.println("1-Saldo  2-Depositar  3-Sacar  0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.printf("Saldo: R$ %.2f%n", saldo);
                case 2 -> {
                    System.out.print("Valor do depósito: ");
                    saldo += sc.nextDouble();
                }
                case 3 -> {
                    System.out.print("Valor do saque: ");
                    double saque = sc.nextDouble();
                    if (saque <= saldo) saldo -= saque;
                    else System.out.println("Saldo insuficiente.");
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }
}
import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, total = 0;

        do {
            System.out.print("Valor da compra (0 para encerrar): ");
            valor = sc.nextDouble();
            total += valor;
        } while (valor != 0);

        System.out.printf("Total gasto: R$ %.2f%n", total);
    }
}

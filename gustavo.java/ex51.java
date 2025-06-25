import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1+  2-  3*  4/  0-Sair");
            op = sc.nextInt();
            if (op == 0) break;

            System.out.print("A: ");
            double a = sc.nextDouble();
            System.out.print("B: ");
            double b = sc.nextDouble();

            switch (op) {
                case 1 -> System.out.println("Resultado = " + (a + b));
                case 2 -> System.out.println("Resultado = " + (a - b));
                case 3 -> System.out.println("Resultado = " + (a * b));
                case 4 -> {
                    if (b != 0) System.out.println("Resultado = " + (a / b));
                    else System.out.println("Divisão por zero!");
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (true);
    }
}
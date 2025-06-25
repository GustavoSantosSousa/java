import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("""
                1-Soma
                2-Subtração
                3-Multiplicação
                4-Divisão
                0-Sair""");
            op = sc.nextInt();
            if (op == 0) break;
            System.out.print("A: "); double a = sc.nextDouble();
            System.out.print("B: "); double b = sc.nextDouble();

            switch (op) {
                case 1 -> System.out.println("Resultado = " + (a + b));
                case 2 -> System.out.println("Resultado = " + (a - b));
                case 3 -> System.out.println("Resultado = " + (a * b));
                case 4 -> System.out.println(b != 0 ? "Resultado = " + (a / b) : "Divisão por zero!");
                default -> System.out.println("Opção inválida");
            }
        } while (true);
    }
}
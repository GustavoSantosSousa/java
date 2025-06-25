import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1º número: ");
        double a = sc.nextDouble();

        System.out.print("Operador (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("2º número: ");
        double b = sc.nextDouble();

        double r = 0;
        switch (op) {
            case '+': r = a + b; break;
            case '-': r = a - b; break;
            case '*': r = a * b; break;
            case '/': r = b != 0 ? a / b : Double.NaN; break;
            default:
                System.out.println("Operador inválido."); return;
        }
        System.out.println("Resultado = " + r);
    }
}

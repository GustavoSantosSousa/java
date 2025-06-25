import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1 - km → m
                2 - m  → cm
                3 - cm → mm
                4 - Sair""");
        int op = sc.nextInt();
        if (op == 4) return;

        System.out.print("Valor a converter: ");
        double v = sc.nextDouble();

        switch (op) {
            case 1 -> System.out.println("Resultado: " + (v * 1_000) + " m");
            case 2 -> System.out.println("Resultado: " + (v *   100) + " cm");
            case 3 -> System.out.println("Resultado: " + (v *   10)  + " mm");
            default -> System.out.println("Opção inválida");
        }
    }
}
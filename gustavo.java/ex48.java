import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            sc.nextLine(); // limpar \n

            double media = (n1 + n2) / 2;
            System.out.printf("Média de %s: %.2f%n", nome, media);

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.nextLine();
        } while (!continuar.equalsIgnoreCase("n"));
    }
}
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[][] notas = new double[5][2];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine(); // limpa \n
        }

        System.out.println("\nMédias:");
        for (int i = 0; i < 5; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2.0;
            System.out.printf("%s → %.2f%n", nomes[i], media);
        }
    }
}

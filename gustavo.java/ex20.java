import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[4];    // índices 1,2,3 = candidatos

        while (true) {
            System.out.print("Vote (1,2,3) ou 0 para encerrar: ");
            int v = sc.nextInt();
            if (v == 0) break;
            if (v >= 1 && v <= 3) votos[v]++;
            else System.out.println("Voto inválido.");
        }

        System.out.println("\nApuração final:");
        for (int i = 1; i <= 3; i++)
            System.out.println("Candidato " + i + ": " + votos[i] + " voto(s)");
    }
}
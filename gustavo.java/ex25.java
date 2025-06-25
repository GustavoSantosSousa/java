import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();
            if (n > maior) maior = n;
        }
        System.out.println("Maior = " + maior);
    }
}
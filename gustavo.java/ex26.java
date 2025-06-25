import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número para a tabuada: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d%n", n, i, n * i);
    }
}
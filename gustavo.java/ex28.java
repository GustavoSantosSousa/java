import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número para fatorial: ");
        int n = sc.nextInt();
        long fat = 1;

        for (int i = n; i >= 2; i--) fat *= i;
        System.out.println(n + "! = " + fat);
    }
}
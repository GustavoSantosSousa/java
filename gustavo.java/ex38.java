import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        int n = sc.nextInt();

        while (n > 0) System.out.println(n--);
        System.out.println("Fim!");
    }
}
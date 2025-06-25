import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segredo = 7, chute;

        do {
            System.out.print("Adivinhe o número (1-10): ");
            chute = sc.nextInt();
        } while (chute != segredo);

        System.out.println("Acertou!");
    }
}
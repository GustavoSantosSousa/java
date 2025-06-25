import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vogal");
            default -> System.out.println("Consoante");
        }
    }
}
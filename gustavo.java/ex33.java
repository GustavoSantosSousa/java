import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals("1234"));

        System.out.println("Acesso permitido!");
    }
}
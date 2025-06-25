import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, senha;

        do {
            System.out.print("Login: ");
            login = sc.nextLine();
            System.out.print("Senha: ");
            senha = sc.nextLine();
        } while (!login.equals("user") || !senha.equals("1234"));

        System.out.println("Acesso concedido!");
    }
}
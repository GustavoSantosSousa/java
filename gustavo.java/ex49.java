import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "admin", senha = "1234";
        int tentativas = 0;
        boolean sucesso = false;

        do {
            System.out.print("Login: ");
            String l = sc.nextLine();
            System.out.print("Senha: ");
            String s = sc.nextLine();
            tentativas++;

            if (l.equals(user) && s.equals(senha)) {
                sucesso = true;
                break;
            }
        } while (tentativas < 3);

        System.out.println(sucesso ? "Login realizado!" : "Acesso bloqueado.");
    }
}

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "abc123", tentativa;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextLine();
            tentativas++;
        } while (!tentativa.equals(senha) && tentativas < 3);

        if (tentativa.equals(senha))
            System.out.println("Acesso permitido!");
        else
            System.out.println("Acesso bloqueado.");
    }
}
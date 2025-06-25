import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        do {
            System.out.print("Digite um nome (fim para encerrar): ");
            nome = sc.nextLine();
            if (!nome.equalsIgnoreCase("fim")) System.out.println("Nome: " + nome);
        } while (!nome.equalsIgnoreCase("fim"));
    }
}
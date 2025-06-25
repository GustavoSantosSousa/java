import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine().toLowerCase();

        switch (nome) {
            case "arroz", "feijão", "macarrão" -> System.out.println("Categoria: Alimento");
            case "sabão", "detergente" -> System.out.println("Categoria: Limpeza");
            case "camisa", "calça" -> System.out.println("Categoria: Vestuário");
            default -> System.out.println("Categoria desconhecida");
        }
    }
}
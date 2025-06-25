import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] clientes = new String[100];
        int qtd = 0;

        while (true) {
            System.out.println("""
                1-Adicionar   2-Listar
                3-Editar      4-Excluir
                5-Sair""");
            int op = sc.nextInt();
            sc.nextLine();                 // limpa \n

            switch (op) {
                case 1 -> {                         // adicionar
                    System.out.print("Nome: ");
                    clientes[qtd++] = sc.nextLine();
                }
                case 2 -> {                         // listar
                    for (int i = 0; i < qtd; i++)
                        System.out.println(i + " - " + clientes[i]);
                }
                case 3 -> {                         // editar
                    System.out.print("Índice a editar: ");
                    int i = sc.nextInt(); sc.nextLine();
                    if (i >= 0 && i < qtd) {
                        System.out.print("Novo nome: ");
                        clientes[i] = sc.nextLine();
                    }
                }
                case 4 -> {                         // excluir
                    System.out.print("Índice a excluir: ");
                    int i = sc.nextInt(); sc.nextLine();
                    if (i >= 0 && i < qtd) {
                        for (int j = i; j < qtd - 1; j++)
                            clientes[j] = clientes[j + 1];
                        qtd--;
                    }
                }
                case 5 -> { return; }               // sair
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}

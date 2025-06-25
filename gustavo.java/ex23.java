public class Ex23 {
    public static void main(String[] args) {
        int pares = 0;
        for (int i = 1; i <= 50; i++)
            if (i % 2 == 0) pares++;
        System.out.println("Quantidade de pares: " + pares);
    }
}
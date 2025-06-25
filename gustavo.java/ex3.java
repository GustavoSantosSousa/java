public class Ex3 {
    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) v[i] = 2 * (i + 1);

        System.out.println("Pares de 2 a 20:");
        for (int n : v) System.out.println(n);
    }
}
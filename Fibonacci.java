public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(hasil + " ");

        }
    }

    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;

        }
        if (n == 1) {
            return 1;

        }
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
}
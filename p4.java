import java.util.Random;

public class p4 {
    public static void main(String[] args) {
        Random random = new Random();

        int numar1 = random.nextInt(30) + 1; // [0, 29] + 1 => [1, 30]
        int numar2 = random.nextInt(30) + 1;

        System.out.println("Numerele generate sunt: " + numar1 + " și " + numar2);

        int cmmdc = calculeazaCmmdc(numar1, numar2);

        System.out.println("CMMDC al numerelor " + numar1 + " și " + numar2 + " este: " + cmmdc);
    }

    public static int calculeazaCmmdc(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}


import java.util.Random;

public class p5 {
    public static void main(String[] args) {
        Random random = new Random();

        int numar = random.nextInt(21); // nextInt(21) generează un număr în intervalul [0, 20]
        System.out.println("Numărul generat este: " + numar);

        if (esteFibonacci(numar)) {
            System.out.println("Numărul " + numar + " aparține șirului lui Fibonacci.");
        } else {
            System.out.println("Numărul " + numar + " nu aparține șirului lui Fibonacci.");
        }
    }

    public static boolean esteFibonacci(int numar) {
        if (numar < 0) return false;

        return estePatratPerfect(5 * numar * numar + 4) || estePatratPerfect(5 * numar * numar - 4);
    }

    public static boolean estePatratPerfect(int numar) {
        int radacina = (int) Math.sqrt(numar);
        return radacina * radacina == numar;
    }
}

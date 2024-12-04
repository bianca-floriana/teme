import java.util.Scanner;

    public class p1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceți lungimea dreptunghiului: ");
            double lungime = scanner.nextDouble();

            System.out.print("Introduceți lățimea dreptunghiului: ");
            double latime = scanner.nextDouble();

            double perimetru = 2 * (lungime + latime);

            double aria = lungime * latime;

            System.out.println("Perimetrul dreptunghiului este: " + perimetru);
            System.out.println("Aria dreptunghiului este: " + aria);
        }
    }


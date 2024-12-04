import java.util.Scanner;

public class p3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceți un număr natural: ");
            int n = scanner.nextInt();

            boolean estePrim = true;

            System.out.println("Divizorii numărului " + n + " sunt:");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    if (i != 1 && i != n) {
                        estePrim = false; // Numărul are alți divizori în afară de 1 și el însuși
                    }
                }
            }

            System.out.println();

            if (estePrim && n > 1) {
                System.out.println("Numărul " + n + " este prim.");
            } else if (n > 1) {
                System.out.println("Numărul " + n + " nu este prim.");
            } else {
                System.out.println("Numărul " + n + " nu este considerat prim.");
            }

            scanner.close();
        }
    }


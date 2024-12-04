import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Biu\\IdeaProjects\\untitled2\\src\\in.txt";
        String outputFile = "C:\\Users\\Biu\\IdeaProjects\\untitled2\\src\\out.txt";

        List<Double> numere = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    numere.add(Double.parseDouble(line));
                } catch (NumberFormatException e) {
                    System.out.println("Linie invalidă ignorată: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fișierului: " + e.getMessage());
            return;
        }

        if (numere.isEmpty()) {
            System.out.println("Fișierul nu conține numere valide.");
            return;
        }

        double suma = 0, minim = Double.MAX_VALUE, maxim = Double.MIN_VALUE;
        for (double numar : numere) {
            suma += numar;
            if (numar < minim) minim = numar;
            if (numar > maxim) maxim = numar;
        }
        double media = suma / numere.size();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Minim: " + minim);
        System.out.println("Maxim: " + maxim);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Suma: " + suma + "\n");
            bw.write("Media: " + media + "\n");
            bw.write("Minim: " + minim + "\n");
            bw.write("Maxim: " + maxim + "\n");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fișierului: " + e.getMessage());
        }
    }
}

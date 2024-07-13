import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Definindo
        Locale.setDefault(Locale.US);

        // Entrada de dados
        Scanner wordInput = new Scanner(System.in);
        Scanner numberInput = new Scanner(System.in);

        String word;
        word = wordInput.next();

        System.out.println("você digitou: " + word);

        // int number;
        double number;

        // number = numberInput.nextInt();
        number = numberInput.nextDouble();

        System.out.println("você digitou: %.2f%n" + number);

        wordInput.close();
        numberInput.close();
    }
}

/**
 * exemplo para pegar o primeiro caracter de input
 */
// word = wordInput.next().charAt(0);

/**
 * exemplo de entrada de multiplos dados
 */

// String x;
// int y;
// double z;

// x = sc.next();
// y = sc.nextInt();
// z = sc.nextDouble();

// System.out.println("Dados digitados: ");
// System.out.println(x);
// System.out.println(y);
// System.out.println(z);
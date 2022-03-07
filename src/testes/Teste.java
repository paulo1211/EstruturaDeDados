package testes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayteste = new int [5];

        for(int i = 0; i < 5; i++){
            arrayteste[i] = input.nextInt();
        }

        /*
        for (int numeros: arrayteste) {
            System.out.println("for each:");
            System.out.println("Valor: " + numeros);
        }

        System.out.println();

        for(int i = 0; i < 5; i++){
            System.out.println("For normal");
            System.out.println("Valor: " + arrayteste[i] + " na posição: " + i);
        }

        System.out.println("Usando stream: ");
        IntStream.of(arrayteste).forEach(value -> System.out.printf("Valor: %d\n", value));
*/
        IntStream.of(arrayteste)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(System.out::println);

    }
}
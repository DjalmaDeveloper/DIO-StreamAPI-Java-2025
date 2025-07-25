package stream_api;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/*Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.*/
public class desafio_14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPrime = n -> n > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);

        Optional<Integer> maiorPrimo = numeros.stream().distinct().filter(isPrime).max(Integer::compare);
        System.out.println("Maior primo: " + maiorPrimo.get());
    }


}

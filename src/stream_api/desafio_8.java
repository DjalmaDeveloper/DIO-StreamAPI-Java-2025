package stream_api;

import java.util.Arrays;
import java.util.List;

/*Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista
e exiba o resultado no console.*/
public class desafio_8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream().mapToInt(numero -> String.valueOf(numero)
                .chars()
                .map(Character::getNumericValue)
                .sum()).sum();
        System.out.println("Soma dos números: " + somaDigitos);
    }
}

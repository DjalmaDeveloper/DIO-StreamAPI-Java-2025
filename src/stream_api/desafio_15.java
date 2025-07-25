package stream_api;

import java.util.Arrays;
import java.util.List;

/*Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
e exiba o resultado no console.*/
public class desafio_15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean possuiNumeroNegativo = numeros.stream().anyMatch(n -> n < 0);
        System.out.println("Possui número negativo: " + possuiNumeroNegativo);
    }
}

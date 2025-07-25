package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Desafio 16 - Agrupe os números em pares e ímpares:
Utilize a Stream API para agrupar os números em duas listas separadas,
uma contendo os números pares e outra contendo os números ímpares da lista original,
e exiba os resultados no console.*/
public class desafio_16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<String, List<Integer>> grupos = numeros.stream().collect(Collectors.groupingBy(n -> {
            if(n % 2 == 0){
                return "Números pares";
            }
            else {
                return "Números ímpares";
            }
        }));

        grupos.forEach((chave, lista) -> System.out.println(chave + ": " + lista));
    }
}

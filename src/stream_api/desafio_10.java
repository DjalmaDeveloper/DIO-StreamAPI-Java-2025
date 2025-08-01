package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.*/
public class desafio_10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<String, List<Integer>> grupos = numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .collect(Collectors.groupingBy(numero -> {
            if(numero % 3 == 0 && numero % 5 == 0){
                return "Múltiplo de 3 e 5";
            }
            else if (numero % 3 == 0){
                return "Múltiplo de 3";
            }
            else{
                return "Múltiplo de 5";
            }
        }));

        grupos.forEach((chave, lista) -> System.out.println(chave + ": " + lista));
    }
}

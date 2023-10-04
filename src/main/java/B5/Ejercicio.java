package B5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());



        List<Integer> duplicados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());

        int sumaDuplicados = duplicados.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Optional<Integer> MaxNumDupli= duplicados.stream()
                .max(Integer::compareTo);

        System.out.println("Números pares: " + pares);
        System.out.println("Números duplicados: " + duplicados);
        System.out.println("Suma de números duplicados: " + sumaDuplicados);
        System.out.println("d. Número más grande en la lista duplicada: " + (MaxNumDupli.get()));
    }
}

package functional_interface.examples;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //        Optional<String> optionalString = Optional.ofNullable(null);
////        Optional<String> optionalString = Optional.empty();
//        String result = optionalString.orElse("Default");
//        System.out.println(result);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElseGet(() -> "Value of Supplier");
//        System.out.println(result);

//        Optional<String> optionalValue = Optional.ofNullable(null);
//        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
//        System.out.println(result);

        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));

    }
}

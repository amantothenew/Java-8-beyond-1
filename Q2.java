// Q2)Convert an Optional type into Stream

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class MyClass{
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Aman");
        Stream<String> stream = optional.stream();
        System.out.println(stream.findFirst().get());
    }
}

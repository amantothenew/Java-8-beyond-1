// Q4)Create Unmodifiable List from a Steam

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class MyClass{
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        List<Integer> unmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());

        System.out.println(unmodifiableList);
    }
}

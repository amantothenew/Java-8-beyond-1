// Q3)Use Of method to create List, Set and Map

import java.util.List;
import java.util.Map;
import java.util.Set;

class MyClass{
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        Set<Integer> set = Set.of(1,2,3,4,5,6);
        Map<Integer, String> map = Map.of(1,"Aman", 2,"Sahil", 3,"Aksh");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}

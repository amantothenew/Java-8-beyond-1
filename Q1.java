// Q1)Use iterator stream method to generate a stream

import java.util.List;
import java.util.stream.IntStream;

class MyClass{
    public static void main(String[] args) {
        List<Integer> list= IntStream.iterate(1, x->x<100, x->x+1).boxed().toList();
        System.out.println(list);
    }
}

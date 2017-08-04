package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;


/**
 * Inspired by:
 * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 *
 */
public class TestStreams {

    public TestStreams() {
    }

    public static void main(String[] args) {
        TestStreams runner = new TestStreams();
        runner.filterAndSort();
        runner.reuse();
    }
    

    private void filterAndSort(){
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
   }

   private void reuse() {
       Supplier<Stream<String>> streamSupplier =
               () -> Stream.of("d2", "a2", "b1", "b3", "c")
                       .filter(s -> s.startsWith("a"));

       System.out.println(streamSupplier.get().anyMatch(s -> true));   //true
       System.out.println(streamSupplier.get().noneMatch(s -> true));  // false
   }
}

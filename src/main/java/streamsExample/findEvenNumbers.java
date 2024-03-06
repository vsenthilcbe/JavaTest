package streamsExample;

import java.util.Arrays;
import java.util.List;

public class findEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,2,14,17,19,20);

        list.stream().filter(n -> n%2==0).forEach(System.out::println);

    }

}

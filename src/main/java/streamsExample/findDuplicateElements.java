package streamsExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicateElements {

    private static void findDuplicatesUsingJava8(int[] inputArray)
    {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }
    public static void main(String[] args) {
        findDuplicatesUsingJava8(new int[]{1,2,3,4,52,3,4,4});
    }
}

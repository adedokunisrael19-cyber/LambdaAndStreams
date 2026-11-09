import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] numbers = {15,3,4,7,2,5,97,9,6,3};

        Arrays.stream(numbers)
                .map((number) -> number * number)
                .forEach((number) -> System.out.println(number));
    }
}

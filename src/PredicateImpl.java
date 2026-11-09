import java.util.function.Predicate;

public class PredicateImpl {
    static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(3));
    }
}

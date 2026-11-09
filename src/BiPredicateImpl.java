import java.util.function.BiPredicate;

public class BiPredicateImpl {
    static void main(String[] args) {
        BiPredicate <Integer, Integer> biPredicate = (a, b) -> (a % b ==0);
        System.out.println(biPredicate.test(3, 4));
        System.out.println(biPredicate.test(4, 4));
    }
}

import java.util.function.BiFunction;

public class BifunctionImpl {
    static void main(String[] args) {
        BiFunction<Integer, Integer, Double> biFunction =  (a, b) -> (double) (a*b);
        System.out.println(biFunction.apply(3, 2));
    }

}

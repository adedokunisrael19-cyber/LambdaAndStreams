import java.math.BigDecimal;
import java.util.function.Function;

public class FunctionImpl {
    static void main(String[] args) {
        Function<String, BigDecimal> func = (amount) -> new BigDecimal(amount.trim());


        System.out.println(func.apply("1000  "));
    }
    //Function, Predicate, Bipredicate, Unary, Binary



}

import java.util.function.BinaryOperator;

public class BinaryImpl {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        BinaryOperator<String> binaryOperator1 = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(3, 2));
        System.out.println(binaryOperator1.apply("ade", "olu"));
    }
}

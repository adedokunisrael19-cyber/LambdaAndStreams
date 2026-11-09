import java.util.function.UnaryOperator;

public class UnaryImpl {
    static void main(String[] args) {
        UnaryOperator<String> operator = String::toUpperCase;
        System.out.println(operator.apply("hello"));
    }
}

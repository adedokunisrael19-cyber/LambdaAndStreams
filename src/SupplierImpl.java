import java.security.SecureRandom;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierImpl {
    static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> new SecureRandom().nextInt(1,5);
        System.out.println(integerSupplier.get());

        Stream.generate(integerSupplier).forEach((number) -> System.out.println(number));
    }
}

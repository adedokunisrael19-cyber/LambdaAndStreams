import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
    Map<String, Integer> map = Map.of(
            "Adamu", 25,
            "Bola", 900,
                "Dike", 10
            );
    map.forEach( (name, age) ->
            System.out.println("my name is "+name+" and age is "+age));
    }
}
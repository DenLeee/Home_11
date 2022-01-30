import java.lang.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BicycleShop bicycleShop = new BicycleShop();

        bicycleShop.getProducts().forEach((k, v) -> System.out.println("Артикул " + k + v));
        System.out.println();

        print(bicycleShop.getProducts());
        System.out.println();

        System.out.println(bicycleShop.getProduct("Bt997"));

    }

    public static void print(Map<String, Product> products) {
        Map<String, Product> temp = products.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (t1, t2) -> t1, LinkedHashMap::new));
        temp.forEach((k, v) -> System.out.println("Артикул " + k + v));
    }



}

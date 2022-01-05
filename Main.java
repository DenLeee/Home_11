
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Product> product = new HashMap<>();

        Product product1 = new Product("Подшибник", 16);
        Product product2 = new Product("Спица", 180);
        Product product3 = new Product("Колесо", 30);
        Product product4 = new Product("Тормоза", 54);
        Product product5 = new Product("Тросс", 8);
        Product product6 = new Product("Рама", 4);
        Product product7 = new Product("Шина", 12);
        Product product8 = new Product("Амортизотор", 3);
        Product product9 = new Product("Педаль", 91);
        Product product10 = new Product("Цепь", 19);

        product.put("Bp068", product1);
        product.put("Bs084", product2);
        product.put("Bk113", product3);
        product.put("Bt698", product4);
        product.put("Bt997", product5);
        product.put("Br006", product6);
        product.put("Bs075", product7);
        product.put("Ba106", product8);
        product.put("Bp305", product9);
        product.put("Bс066", product10);


        System.out.println(product.get("Br006"));
        System.out.println();

        printMap(product);
        System.out.println();
        printMap(repostSort(product));

    }

    public static <String, Product extends Comparable<? super Product>> Map<java.lang.String, Product> repostSort(Map<String, Product> map) {
        List<Map.Entry<String, Product>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<java.lang.String, Product> result = new LinkedHashMap<>();
        for (Map.Entry<String, Product> entry : list) {
            result.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        return result;
    }



    public static void printMap(Map<String, Product> map) {
        map.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
    }
}

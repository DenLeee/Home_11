import java.lang.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BicycleShop bicycleShop = new BicycleShop();


        printReport(bicycleShop);
        System.out.println();

        System.out.println(bicycleShop.getProduct("Bt997"));

    }
    public static void printReport(BicycleShop bicycleShop) {
        bicycleShop.report().forEach((k, v) -> System.out.println("Артикул " + k + v));
    }
}

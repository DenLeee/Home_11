import java.lang.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        BicycleShop bicycleShop = new BicycleShop();

        bicycleShop.printReport();
        System.out.println();

        System.out.println(bicycleShop.getProduct("Bt997"));

    }
}


import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        BicycleShop bicycleShop = new BicycleShop();

        bicycleShop.getProducts().forEach((k, v) -> System.out.println("Артикул " + k + v));
        System.out.println();

        bicycleShop.print();
        System.out.println();

        System.out.println(bicycleShop.getProduct("Bt997"));


    }



}

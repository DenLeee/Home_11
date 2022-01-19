
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        BicycleShop bicycleShop = new BicycleShop();

        System.out.println(bicycleShop.getProducts().get(2));
        System.out.println();

        bicycleShop.print();
        System.out.println();

        System.out.println(bicycleShop.getProduct("Bt997"));


    }



}

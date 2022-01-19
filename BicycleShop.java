import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BicycleShop {
    private List<Product> products = new ArrayList<>();

    public BicycleShop() {
        products.add(new Product("Bp068","Подшибник", 16));
        products.add(new Product("Bs084","Спица", 180));
        products.add(new Product("Bk113","Колесо", 30));
        products.add(new Product("Bt698","Тормоза", 54));
        products.add(new Product("Bt997","Тросс", 8));
        products.add(new Product("Br006","Рама", 4));
        products.add(new Product("Bs075","Шина", 12));
        products.add(new Product("Ba106","Амортизотор", 3));
        products.add(new Product("Bp305","Педаль", 91));
        products.add(new Product("Bс066","Цепь", 19));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(String id) {
        for(int i=0; i<products.size(); i++) {
            if (products.get(i).getId().equals(id))
                return products.get(i);
        }
        return null;
    }

    public void print() {
        Collections.sort(products);
        products.forEach(System.out::println);
    }

}


package exam2;
import java.util.HashMap;
import java.util.Map;

public class Number_2 {
   

public class SariSariStore {
    private final String indayMapanira;
    private final Map<String, Integer> products;

    public SariSariStore(String ownerName) {
        this.indayMapanira = ownerName;
        this.products = new HashMap<>();
        initializeProducts();
    }

    private void initializeProducts() {
        products.put("Fita", 10);
        products.put("Pride Power", 10);
        products.put("Canola Oil", 10);
        products.put("Nescafe Black Coffee", 10);
        products.put("Ariel Powder", 10);
        products.put("Rebisco", 10);
        products.put("Steelwool", 10);
        products.put("Head and Shoulders", 10);
        products.put("Nova", 10);
        products.put("Tanduay", 10);
        products.put("Bearbrand", 10);
        products.put("Nature Spring Mineral Water 400ml", 10);
        products.put("Coke 1L", 10);
        products.put("Sprite Kasalo", 10);
        products.put("Royal 1L", 10);
        products.put("Sugar", 10);
    }

    public boolean checkProduct(String productName) {
        return products.containsKey(productName);
    }

    public void buyProduct(String productName) {
        if (products.containsKey(productName)) {
            int currentQuantity = products.get(productName);
            if (currentQuantity > 0) {
                products.put(productName, currentQuantity - 1);
                System.out.println("Product " + productName + " ang sukli taysa.");
            } else {
                System.out.println("Product " + productName + " walay stock bai");
            }
        } else {
            System.out.println("Product " + productName + " not avaialble ug walay stock parehas ra.");
        }
    }
}
}

  
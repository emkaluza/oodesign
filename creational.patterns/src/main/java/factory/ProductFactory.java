package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class ProductFactory {
    private static ProductFactory instance = new ProductFactory();
    private Map<String, Product> map = new HashMap();

    public static ProductFactory instance() {
        return instance;
    }

    public void registerProduct(final String productID, final Product product) {
        this.map.put(productID, product);
    }

    public Product createProduct(final String productID) {
        return map.get(productID).createProduct();
    }

    public Set<String> getIDs(){
        return map.keySet();
    }
}
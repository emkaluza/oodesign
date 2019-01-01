package factory;

class FactoryMain {

    static{
        ProductFactory.instance().registerProduct("P1", new ProductOne());
        ProductFactory.instance().registerProduct("P2", new ProductTwo());
    }

    public static void main(String... args) {
        for (String key : ProductFactory.instance().getIDs()) {
            System.out.println(ProductFactory.instance().createProduct(key).getClass().toGenericString());
        }
    }
}

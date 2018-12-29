package factory;

class ProductTwo extends Product {

    static{
        ProductFactory.instance().registerProduct("P2", new ProductTwo());
    }

    @Override
    public Product createProduct() {
        return new ProductTwo();
    }
}
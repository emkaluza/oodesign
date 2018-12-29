package factory;

class ProductOne extends Product {

    @Override
    public Product createProduct() {
        return new ProductOne();
    }
}
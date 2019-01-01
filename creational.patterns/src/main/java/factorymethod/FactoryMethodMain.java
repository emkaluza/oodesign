package factorymethod;

class FactoryMethodMain {
    public static void main(final String... args) {
        ChocolateProducer producer = new DefaultChocolateProducer();

        System.out.println(producer.createChococalate("milky").getTaste());
        System.out.println(producer.createChococalate("dessert").getTaste());
    }
}

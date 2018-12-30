package factorymethod;

public class DefaultChocolateProducer implements ChocolateProducer {
    @Override
    public Chocolate createChococalate(String choco) {
        if (choco.equalsIgnoreCase("dessert")) {
            return new DessertChocolate().getChocolate();
        } else if (choco.equalsIgnoreCase("milky")) {
            return new MilkyChocolate().getChocolate();
        }

        return null;
    }
}

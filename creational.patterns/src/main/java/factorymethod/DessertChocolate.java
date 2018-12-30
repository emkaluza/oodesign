package factorymethod;

public class DessertChocolate extends AbstractChocolate {
    public DessertChocolate() {
        super("Dessert");
    }

    @Override
    public Chocolate getChocolate() {
        addCoco();
        return this;
    }
}

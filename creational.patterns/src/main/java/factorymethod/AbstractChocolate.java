package factorymethod;

abstract class AbstractChocolate implements Chocolate{
    private final String taste;

    protected AbstractChocolate(final String taste) {
        this.taste = taste;
    }

    @Override
    public String getTaste() {
        return taste;
    }

    protected void addCoco() {
        //add coco ingredient
    }

    public abstract Chocolate getChocolate();
}

package adapterpattern;

class SuperiorCoffeeMachine {
    public enum CoffeeType {ESPRESSO, LONG, DOPPIO};

    public void brewCoffee(final CoffeeType type) {
        System.out.println(""+this.getClass().getSimpleName()+": brewing coffee "+type.name()+"... bzzzz bzz READY!");
    }
}

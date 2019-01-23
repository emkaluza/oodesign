package adapterpattern;

class CoffeeMachineApp {
    private CoffeeMachineI coffeeMachine;

    public CoffeeMachineApp(final CoffeeMachineI coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void brewCoffee() {
        System.out.println("Brewing coffee");
        coffeeMachine.brewCoffee();
    }
}

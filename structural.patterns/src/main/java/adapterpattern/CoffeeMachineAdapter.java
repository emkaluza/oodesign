package adapterpattern;

class SuperiorCoffeeMachineAdapter implements CoffeeMachineI {
    private SuperiorCoffeeMachine coffeeMachine;

    public SuperiorCoffeeMachineAdapter(final SuperiorCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void brewCoffee() {
        coffeeMachine.brewCoffee(SuperiorCoffeeMachine.CoffeeType.ESPRESSO);
    }
}

package adapterpattern;

class AdapterPatternMain {
    public static void main(String... args) {
        CoffeeMachineApp app = new CoffeeMachineApp(new SimpleCoffeeMachine());
        app.brewCoffee();

        //CoffeeMachineApp can only brew simple cofee, it cannot use SuperiorCoffeeMachine
        //that is why we need an adapter class
        app = new CoffeeMachineApp(new SuperiorCoffeeMachineAdapter(new SuperiorCoffeeMachine()));
        app.brewCoffee();
    }
}

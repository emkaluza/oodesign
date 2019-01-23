package adapterpattern;

class SimpleCoffeeMachine implements CoffeeMachineI {

    @Override
    public void brewCoffee() {
        System.out.println(""+this.getClass().getSimpleName()+": basic coffee brewed!");
    }
}

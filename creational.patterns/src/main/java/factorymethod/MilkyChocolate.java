package factorymethod;

class MilkyChocolate extends AbstractChocolate {

    public MilkyChocolate(){
        super("Milky");
    }

    @Override
    public Chocolate getChocolate() {
        addMilk();
        addSugar();
        addCoco();
        return this;
    }

    private void addMilk() {
        //adding milk
    }

    private void addSugar() {
        //adding sugar
    }
}

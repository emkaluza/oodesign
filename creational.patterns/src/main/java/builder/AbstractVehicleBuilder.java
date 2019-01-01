package builder;

abstract class AbstractVehicleBuilder {
    protected Vehicle vehicle;

    public void newVehicle(){
        this.vehicle = new Vehicle();
    }

    public Vehicle buildVehicle(){
        return vehicle;
    }

    public abstract void buildWheels();
    public abstract void buildDoors();
    public abstract void buildGear();
    public abstract void buildColor();
}

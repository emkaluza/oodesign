package builder;

class SuzukiBuilder extends AbstractVehicleBuilder {

    @Override
    public void buildWheels() {
        vehicle.setWheels(4);
    }

    @Override
    public void buildDoors() {
        vehicle.setDoors(4);
    }

    @Override
    public void buildGear() {
        vehicle.setGear("automatic");
    }

    @Override
    public void buildColor() {
        vehicle.setColor("Silver-Black");
    }
}

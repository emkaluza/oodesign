package builder;

class MaluchBuilder extends AbstractVehicleBuilder {
    @Override
    public void buildWheels() {
        vehicle.setWheels(4);
    }

    @Override
    public void buildDoors() {
        vehicle.setDoors(2);
    }

    @Override
    public void buildGear() {
        vehicle.setGear("manual");
    }

    @Override
    public void buildColor() {
        vehicle.setColor("Yellow");
    }
}

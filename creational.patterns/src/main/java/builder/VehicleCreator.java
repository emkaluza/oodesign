package builder;

class VehicleCreator {
    private AbstractVehicleBuilder builder;

    public VehicleCreator setBuilder(final AbstractVehicleBuilder builder) {
        this.builder = builder;
        return this;
    }

    public VehicleCreator assembleVehicle(){
        builder.newVehicle();
        builder.buildColor();
        builder.buildDoors();
        builder.buildGear();
        builder.buildWheels();
        return this;
    }

    public Vehicle build(){
        return builder.buildVehicle();
    }

    public Vehicle createAndBuild(){
        return assembleVehicle().build();
    }
}

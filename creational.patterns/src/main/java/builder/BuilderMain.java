package builder;

class BuilderMain {
    public static void main(String... args) {
        VehicleCreator director = new VehicleCreator();
        director.setBuilder(new MaluchBuilder());
        director.assembleVehicle();
        director.build().show();

        director.setBuilder(new SuzukiBuilder());
        director.createAndBuild().show();
    }
}

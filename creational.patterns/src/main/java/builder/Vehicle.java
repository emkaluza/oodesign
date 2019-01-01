package builder;

class Vehicle {
    private int wheels;
    private int doors;
    private String gear;
    private String color;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println(String.format("Vehicle:{\nWheels:\t%s\nDoors:\t%s\nGear:\t%s\nColor:\t%s\n\n", wheels, doors, gear, color));
    }
}

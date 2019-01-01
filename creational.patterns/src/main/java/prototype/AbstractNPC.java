package prototype;

import java.util.Random;

class AbstractNPC implements Cloneable{

    private int health = 150;

    public AbstractNPC() {
        System.out.println("Some pretty heavy operation for creating new object, like loading graphics, resources etc");
    }

    public void attack() {
        health -= new Random().nextInt(health);
        System.out.println("Attacking enemy!...Current health:\t"+health);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package Cwiczenie2;

public class Ship extends Vehicle implements Sailing{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("dokuje");
    }

    @Override
    public void stop(){
        if(isMoving) {
            System.out.println("przestaje plynac");
        }
        else {
            System.out.println("już nie plyne");
        }
        isMoving = false;
    }

    @Override
    public double getFuelNeeds() {
        return 100;
    }

    @Override
    public double getDistance() {
        return 300;
    }
}

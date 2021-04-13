package Cwiczenie2;

public class Truck extends Car {
    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 50;
    }

    @Override
    public double getDistance() {
        return 100;
    }
}

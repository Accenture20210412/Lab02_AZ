package Cwiczenie2;

public class RaceCar extends Car {
    public RaceCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 50;
    }

    @Override
    public double getDistance() {
        return 20;
    }
}

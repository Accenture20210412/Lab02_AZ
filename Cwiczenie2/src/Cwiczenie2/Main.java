package Cwiczenie2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("volvo");
        Truck truck = new Truck("jeep");
        RaceCar raceCar = new RaceCar("ferrari");
        Ship ship = new Ship("motorowka");
        Plane plane = new Plane("boeing");

        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(raceCar);
        vehicles.add(ship);
        vehicles.add(plane);

        for(Vehicle vehicle : vehicles){
            vehicle.go();
            vehicle.stop();
            vehicle.calcFuelEfficiency();
            if(vehicle instanceof Flying){
                ((Flying) vehicle).callAirControl();
            }
        }
    }
}

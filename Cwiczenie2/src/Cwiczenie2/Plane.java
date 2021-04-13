package Cwiczenie2;

public class Plane extends Vehicle implements Flying{
    private boolean isFlying;

    public Plane(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 5000;
    }

    @Override
    public double getDistance() {
        return 1000;
    }

    @Override
    public void takeOff() {
        if(!isFlying) {
            System.out.println("startuje");
        }
        else {
            System.out.println("juz lece");
        }
        isFlying=true;
    }

    @Override
    public void land() {
        if(isFlying) {
            System.out.println("laduje");
        }
        else {
            System.out.println("juz wyladowalem");
        }
        isFlying=false;
    }

    @Override
    public void callAirControl() {
        System.out.println("Houston mamy problem");
    }

    @Override
    public void stop(){
        if(isFlying) {
            System.out.println("nie moge, lece");
        }
        else if(isMoving) {
            System.out.println("zatrzumuje sie");
            isMoving = false;
        }
        else {
            System.out.println("juz stoje");
        }

    }
    @Override
    public void go(){
        if(isFlying) {
            System.out.println("juz lece");
        }
        else if(!isMoving) {
            System.out.println("startuje");
            isMoving=true;
        }
        else {
            System.out.println("juz wystartowalem");
        }
    }
}

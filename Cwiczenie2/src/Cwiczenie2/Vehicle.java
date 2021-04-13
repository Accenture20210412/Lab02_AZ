package Cwiczenie2;

public abstract class Vehicle {
    private String name;
    protected boolean isMoving;

    public Vehicle(String name) {
        this.name = name;
        //domyślnie przy tworzeniu pojazd stoi
        this.isMoving = false;
    }

    public String toString(){
        if(name!=null){
            return name;
        }
        return "";
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    //zakładam, że chcemy uzyskać ile paliwa na ile km
    public double calcFuelEfficiency(){
        return getFuelNeeds()/getDistance();
    }

    public void go(){
        if(!isMoving){
            System.out.println("ruszam");
        }
        else {
            System.out.println("juz jade");
        }
        isMoving = true;
    }

    public void stop(){
        if(isMoving){
            System.out.println("zatrzymuje sie");
        }
        else {
            System.out.println("juz stoje");
        }
        isMoving = false;
    }
}

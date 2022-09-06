package OOP2;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
//        v.color = "Red";
        v.setColor("Red");
        v.print();
        Car c = new Car();
//        c.color ="Black";
        c.setColor("Black");
        c.maxSpeed = 100;
        c.numDoor = 4;
        c.print();
        //c.print();
        Bicycle b = new Bicycle();
        b.print();
    }
}

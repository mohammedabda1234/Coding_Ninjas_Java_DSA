package OOP3;

public class VehicleUse {
    public static void main(String[] args) {
        VehicleInterface v; // = new VehicleInterface();can't direct object from interface class ()
        v = new Car();//get command field of classes
        v.getCompany();
        v.isMotorised();
    }
}

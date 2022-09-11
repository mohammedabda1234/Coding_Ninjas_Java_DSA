package OOP3;

public class Car extends Vehicle implements VehicleInterface,CarInterface{
    //class can only extend one inherit(java not support multi inheritance)
    //class can implement more than one interface(java support multi interface)
    public boolean isMotorised(){
        return true;
    }
    public String getCompany(){
        return null;
    }

    @Override
    public int numGear() {
        return 5;
    }
}

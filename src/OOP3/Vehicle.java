package OOP3;

public class Vehicle implements VehicleInterface{
   private String color;
    int maxSpeed;
   public Vehicle(){
    }
    public Vehicle(int maxSpeed){
       this.maxSpeed =maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle "+"color "+color+" maxSpeed "+maxSpeed);
    }
    public boolean isMotorised(){
       return true;
    }

    @Override
    public String getCompany() {
        return null;
    }
}

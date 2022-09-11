package OOP3;

public class Car extends Vehicle{
    int numDoor;
   public Car(){
    }
    public Car(int numDoor){
       this.numDoor = numDoor;
    }
    public void print(){
        System.out.println("Vehicle "+"color "+getColor()+" maxSpeed "+maxSpeed+" numDoor "+numDoor);
    }

    @Override
    public boolean isMotorised() {
        return true;
    }
}

package OOP2;

public class Vehicle {
   private String color ;//we can't direct use private member (not inherit)
   // private members hide it in inherit class therefore we need setter and getter to void it
    int maxSpeed;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void print(){
        System.out.println("Vehicle "+"color "+getColor()+" maxSpeed "+maxSpeed);
    }
}

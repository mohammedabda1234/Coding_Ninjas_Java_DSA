package OOP1;

public class Student {
   public String name;
    //public that can access to all package in the same project ;
   private int rollNumber;//private int rollNumber;
   //private  can access in same class that have this variable
    String depart;
    //default  can access in all class in same package
    public int getRollNumber(){//getter help us to access with private entity
        return rollNumber;
    }
    public void setRollNumber(int num){//setter
        if (num <= 0){//help us to make control to our data;
            return;
        }
        rollNumber = num;
    }
}

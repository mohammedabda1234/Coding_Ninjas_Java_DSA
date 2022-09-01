package OOP1;

public class Student {
   public String name;
   private int rollNumber;
   public Student(String name,int rollNumber){//constructor with parameter
       this.name = name;
       this.rollNumber = rollNumber;
   }
   public Student(){//default constructor

   }
   public Student(String name){// constructor with one parameter
       this.name = name;
       this.rollNumber = 20;
   }
   public void print(){
       System.out.println(name+" "+rollNumber);
   }
    public int getRollNumber(){//getter help us to access with private entity
        return rollNumber;
    }
    public void setRollNumber(int num){//setter
        if (num >= 0){//help us to make control to our data;
            return;
        }
        rollNumber = num;
    }
}

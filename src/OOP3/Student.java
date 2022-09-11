package OOP3;
public class Student implements print{
    int numRoll;
    public Student(int numRoll){
        this.numRoll = numRoll;
    }

    @Override
    public void print() {
        System.out.println(numRoll);
    }
}

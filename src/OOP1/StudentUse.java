package OOP1;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();//object of student class;
        Student s2 = new Student();
        System.out.println(s1);
        s1.name = "Mohamed";//to access entity of class ;
        s1.setRollNumber(20);
        System.out.println(s1.name+" "+s1.getRollNumber());
        s2.name = "Ali";
        s2.setRollNumber(40);
        System.out.println(s2.name+" "+s2.getRollNumber());
    }
}

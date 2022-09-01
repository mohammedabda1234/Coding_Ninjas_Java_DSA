package OOP1;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();//object of student class;
        Student s2 = new Student();
        System.out.println(s1);
        s1.name = "Mohamed";//to access entity of class ;
        s1.rollNumber = 20;
        System.out.println(s1.name+" "+s1.rollNumber);
    }
}

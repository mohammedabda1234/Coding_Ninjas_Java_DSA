package OOP1;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Ali",20);//object of student class;
        Student s2 = new Student("Mohamed");
        System.out.println(Student.numStudent);//access direct with class
        s1.print();
        s2.print();
    }
}

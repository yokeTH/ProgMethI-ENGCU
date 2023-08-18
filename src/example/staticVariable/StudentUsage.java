package example.staticVariable;

public class StudentUsage {
    public static void main(String[] args) {
        System.out.println(Student.no);
        Student stu1 = new Student("Piti");
        System.out.println(Student.no);
        System.out.println(stu1.getId());
        Student stu2 = new Student("Keen");
        System.out.println(Student.no);
        System.out.println(stu2.getId());
    }
}

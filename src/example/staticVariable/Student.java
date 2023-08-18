package example.staticVariable;

public class Student {
    static int no = 0;
    private final String name;
    private final int id;
    public Student(String name){
        Student.no += 1;
        this.id = Student.no;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

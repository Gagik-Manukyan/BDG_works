package BDG.inheritance.association;
import java.util.List;
import java.util.ArrayList;
public class University {
    private List<Student> students;
    public University() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);

    }
}


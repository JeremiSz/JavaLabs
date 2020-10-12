package labSheet7.exercise2;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name,Student[] students){
        setName(name);
        setStudents(students);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + getName() + '\'' +
                ", students=" + Arrays.toString(getStudents()) +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }
}

package labSheet7.exercise2;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments;

    public Institute(String name, Department[] departments){
        setName(name);
        setDepartments(departments);
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + getName() + '\'' +
                ", departments=" + Arrays.toString(getDepartments()) +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }
    public int getTotalStudents(){
        if(departments == null)return 0;
        int count=0;
        Student[] students = null;

        for (int i = 0; i < departments.length; i++) {
            if(departments[i] != null)
                students = departments[i].getStudents();
                if(students == null) break;
                for (int j = 0; j < students.length; j++) {
                    if(students[i] != null) count++;
                }
        }
        return count;
    }
}

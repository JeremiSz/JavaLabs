package labSheet7.exercise2;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532,"Mary","Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456,"Peter","Creative Media");

        Student[] computingStudents = new Student[10];
        Student[] creativeMediaStudents = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;
        creativeMediaStudents[0] = student2;
        creativeMediaStudents[1] = student4;

        Department d1 = new Department("Computing",computingStudents);
        Department d2 = new Department("Creative Media", creativeMediaStudents);

        Department[] departments = new Department[5];
        departments[0] = d1;
        departments[1] = d2;

        Institute ITT = new Institute("Institute of Technology, Tralee",departments);

        System.out.print(ITT.toString() + "\n" + ITT.getTotalStudents());

        if(ITT.getDepartments()[0].getName() != null &&
                ITT.getDepartments()[1].getName() != null){
            Student[] compStu = ITT.getDepartments()[0].getStudents();
            Student[] mediaStu = ITT.getDepartments()[1].getStudents();

            for (int i = 0; i < compStu.length; i++) {
                if(compStu[i].getId() == 154345){
                    System.out.print("Jake found");

                    Student Jake = compStu[i];
                    Jake.setDepartment("Creative Media");
                    mediaStu[2] = Jake;
                    compStu[i] = null;

                    System.out.print("\n" +ITT);
                    System.exit(0);
                }
            }
            System.out.print("Could not find Jake");
            System.out.print(ITT.toString());
            System.exit(0);
        }
    }
}

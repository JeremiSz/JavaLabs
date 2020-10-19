package labSheet9.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

public class TestPolymorphism {
    public static void main(String args[])
    {
        Employee[] employeeRef = new Employee[3]; //a reference to the Employee superclass

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

        employeeRef[0]=b1; //recall a Boss "is a" Employee so this assignment is allowed
        employeeRef[1]=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too
        employeeRef[2] = new SelfEmployedWorker("hhhjhhhjhh","kjdsaasjdkjdsa");
        for (int i = 0; i < employeeRef.length; i++) {
            System.out.print(employeeRef[i].toString() + "\n");
        }
        System.exit(0);
    }
}
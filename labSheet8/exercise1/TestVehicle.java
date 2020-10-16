package labSheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(1.25,4.5,"Ferrari","F2",100000,2000,2,"05KY1");
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle(500,1.5,1,50,"Raleigh","Mountainbike",4,true);
        String output = "No arg\n\n" + c1 + "\nargs\n" +
                c2 + "\nNo arg\n\n" + b1 + "\narg\n" + b2;
        System.out.print(output);
        System.exit(0);
    }
}

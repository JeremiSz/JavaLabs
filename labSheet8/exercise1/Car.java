package labSheet8.exercise1;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        this(0,0,"nan","nan",0,0,0,"nan");
    }

    public Car(double height,double length,String manufacturer,String model,double price,double weight,int maxPassengers,String registrationNumber){
        super.setHeight(height);
        super.setLength(length);
        super.setManufacturer(manufacturer);
        super.setModel(model);
        super.setPrice(price);
        super.setWeight(weight);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);

    }

    @Override
    public String toString() {
        return "Car{" +
                "maxPassengers=" + getMaxPassengers() +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                '}';
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}

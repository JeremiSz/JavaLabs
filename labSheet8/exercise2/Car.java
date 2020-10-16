package labSheet8.exercise2;

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
        if(isValidRegistrationNumber(registrationNumber))
            this.registrationNumber = registrationNumber;
        else
            this.registrationNumber = "Invalid Registration Number";
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public static boolean isValidRegistrationNumber(String input){
        byte offset=0;
        if(input.length() < 6 && input.length()>12) return false;
        if(!Character.isDigit(input.charAt(0))||!Character.isDigit(input.charAt(1)))return false;
        if(input.charAt(2) != '-')return false;
        if(Character.isLetter(input.charAt(3)) && !Character.isLowerCase(input.charAt(3))){
            if(!Character.isLetter(input.charAt(4))&&!Character.isLowerCase(input.charAt(4)))
                offset = 1;
        }else
            return false;

        if(input.charAt(4 + offset) != '-')return false;
        if(offset > 0 && !Character.isDigit(input.charAt(5)))return false;
        for (int i = 6; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i)))
                return false;
        }
        return true;
    }
}

package labSheet8.exercise1;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle(){
       this(0,0,0,0,"non","non");
    }

    public Vehicle(double price,double length,double weight,double height,String manufacturer,String model){
        setPrice(price);
        setLength(length);
        setWeight(weight);
        setHeight(height);
        setManufacturer(manufacturer);
        setModel(model);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + getPrice() +
                ", length=" + getLength() +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

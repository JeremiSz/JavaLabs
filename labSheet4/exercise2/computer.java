package labSheet4.exercise2;

public class computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    /*public computer(){
        this("unavailable","unavailable",0,0,0);
    }
    public computer(String manufacturer, String type, double speed, int RAM, double price){
        setManufacturer(manufacturer);
        setType(type);
        setSpeed(speed);
        setRAM(RAM);
        setPrice(price);
    }*/

    public double getPrice() {
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public int getRAM() {
        return RAM;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRAM(int RAM) {
        this.RAM = (RAM<0?(RAM * -1):RAM);
    }

    public void setSpeed(double speed) {
        this.speed = (speed<0?(speed * -1):speed);
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString(){
        return "man " + getManufacturer() + " Type " + getType() +
        " Speed " + getSpeed() + " RAM " + getRAM() + " Price " +
        getPrice();
    }
}

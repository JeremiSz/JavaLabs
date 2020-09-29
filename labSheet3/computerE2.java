package labSheet3;

public class computerE2 {
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    public computerE2(){
        this.manufacturer = "";
        this.type = "";
        this.speed = 0;
        this.RAM = 0;
        this.price = 0.00;
    }
    public computerE2(String manufacturer, String type, double speed, int RAM, double price){
        this.manufacturer = manufacturer;
        this.type = type;
        this.speed = speed;
        this.RAM = RAM;
        this.price = price;
    }

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

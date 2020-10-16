package labSheet8.exercise1;

public class Bicycle extends Vehicle{
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        this(0,0,0,0,"nan","nan",0,false);
    }
    public Bicycle(double price,double length,double height,double weight, String manufacturer, String model, int gearCount,boolean hasBell){
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gearCount=" + getGearCount() +
                ", hasBell=" + isHasBell() +
                '}';
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }
}

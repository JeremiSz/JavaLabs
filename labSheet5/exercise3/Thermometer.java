package labSheet5.exercise3;

public class Thermometer {
    private int currentTemp,maxTemp,minTemp;

    public Thermometer(){
        this(0);
    }
    public Thermometer(int currentTemp){
        this.minTemp = Integer.MAX_VALUE;
        this.maxTemp = Integer.MIN_VALUE;
        setTemperature(currentTemp);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "currentTemp=" + currentTemp +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                '}';
    }

    public void setTemperature(int temperature){
        setCurrentTemp(temperature);
        updateMaxMinTemp();
    }
    private void updateMaxMinTemp(){
        if(currentTemp>maxTemp)maxTemp = currentTemp;
        if(currentTemp<minTemp)minTemp = currentTemp;
    }
}

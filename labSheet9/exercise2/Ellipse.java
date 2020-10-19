package labSheet9.exercise2;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    Ellipse(){
        this(0,0);
    }
    Ellipse(double majorAxis,double minorAxis){
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "majorAxis=" + getMajorAxis() +
                ", minorAxis=" + getMinorAxis() +
                ", type='" + type + '\'' +
                '}';
    }

    public void setMajorAxis(double majorAxis) {
        if(majorAxis>=0)
            this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if(minorAxis>=0)
            this.minorAxis = minorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    @Override
    public double area() {
        return Math.PI * getMajorAxis() * getMinorAxis();
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*Math.sqrt((getMajorAxis()*getMajorAxis()+
                getMinorAxis()*getMinorAxis())/2);
    }
}

package labSheet9.exercise1;

public final class SelfEmployedWorker extends Employee {
    private double estimatedIncome;

    public SelfEmployedWorker(String firstname,String lastname){
        super(firstname,lastname);
        setEstimatedIncome((Math.random()*500)+400);
    }

    @Override
    public String toString() {
        return "SelfEmployedWorker{" +
                "estimatedIncome=" + estimatedIncome +
                '}';
    }

    public void setEstimatedIncome(double estimatedIncome) {
        this.estimatedIncome = estimatedIncome;
    }

    @Override
    public double earnings() {
        return estimatedIncome;
    }
}

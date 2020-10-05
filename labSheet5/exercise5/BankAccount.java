package labSheet5.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;

    public BankAccount(){
        this("Owner not available",0);
    }
    public BankAccount(String owner,double interestRate){
        this.number = ++count;
        this.owner = owner;
        BankAccount.interestRate = interestRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                '}';
    }

    public static int getCount() {
        return count;
    }
}

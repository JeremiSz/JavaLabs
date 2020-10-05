package labSheet5.exercise5;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        String output = b1.toString() + BankAccount.getInterestRate() + "\n";
        BankAccount b2 = new BankAccount("Richy Rich",.75);
        output += b2.toString() + BankAccount.getInterestRate() + "\n";
        BankAccount.setInterestRate(.5);
        output += b1 +"\n" + b2 + BankAccount.getInterestRate();
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

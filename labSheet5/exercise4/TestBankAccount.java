package labSheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        String output = b1.toString() + BankAccount.getInterestRate() + "\n";
        BankAccount b2 = new BankAccount("Richy Rich",2342343,.75);
        output += b2 +"\n" + BankAccount.getInterestRate();
        BankAccount.setInterestRate(.5);
        output += b1 +"\n" + b2 + BankAccount.getInterestRate();
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

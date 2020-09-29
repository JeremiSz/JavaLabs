package LabSheet1;

import javax.swing.*;

public class SnackDeal {

    public static void main(String[] args) {
        String name,course,snackAmountStr;
        int snackAmount;

        name = JOptionPane.showInputDialog(null,
                "Please enter your name","Input",
                JOptionPane.QUESTION_MESSAGE);

        course = JOptionPane.showInputDialog(null,
                "Please enter your course","Input",
                JOptionPane.QUESTION_MESSAGE);

        snackAmountStr = JOptionPane.showInputDialog(null,
                "How many snacks would you like?","Input",
                JOptionPane.QUESTION_MESSAGE);
        snackAmount = Integer.valueOf(snackAmountStr);

        String output = "Name: " + name + "\nCouse: " + course +
                "\nSnacks: " + snackAmount + "\nCost: €" + snackAmount*2;

        JOptionPane.showMessageDialog(null,output,
                "Receipt",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}


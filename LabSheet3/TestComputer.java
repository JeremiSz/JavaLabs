package LabSheet3;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output ="";

        computer c1 = new computer();
        c1.setSpeed(-22.22);

        output += "argumentless " + c1.toString();

        computer c2 = new computer("bob","tob",100.11,10,999.99);
        output += "with arguments " + c2.toString();

        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

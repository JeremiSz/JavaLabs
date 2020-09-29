package labSheet4.exercise2;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output ="";

        computer c1 = new computer();

        output += "argumentless " + c1.toString();

        /*computer c2 = new computer("bob","tob",100.11,10,999.99);
        output += "with arguments " + c2.toString();

        computer c3 = new computer("Apple","Desktop",-2.9,12,865);
        output += "the third " + c3.toString();*/

        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

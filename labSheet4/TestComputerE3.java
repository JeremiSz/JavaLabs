package labSheet4;

import javax.swing.*;

public class TestComputerE3 {
    public static void main(String[] args) {
        String output ="";

        computerE3 c1 = new computerE3();
        c1.setSpeed(-22.22);

        output += "argumentless " + c1.toString();

        computerE3 c2 = new computerE3("bob","tob",100.11,10,999.99);
        output += "with arguments " + c2.toString();

        computerE3 c3 = new computerE3("Apple","Desktop",2.9,12,865);
        output += "the third " + c3.toString();

        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

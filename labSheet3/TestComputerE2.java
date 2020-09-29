package labSheet3;

import javax.swing.*;

public class TestComputerE2 {
    public static void main(String[] args) {
        String output ="";

        computerE2 c1 = new computerE2();
        c1.setSpeed(-22.22);

        output += "argumentless " + c1.toString();

        computerE2 c2 = new computerE2("bob","tob",100.11,10,999.99);
        output += "with arguments " + c2.toString();

        computerE2 c3 = new computerE2("Apple","Desktop",2.9,12,865);
        output += "the third " + c3.toString();

        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

package labSheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {
        final float under10kmRate = 1.75f,over10kmRate = 2.5f;
        String name,distanceStr;
        int distanceCycled;

        float amountRaised =0;

        name = JOptionPane.showInputDialog(null,
                "Please enter your name","Input",
                JOptionPane.QUESTION_MESSAGE);
        distanceStr = JOptionPane.showInputDialog(null,
                "Please enter the number of km cycle","input",
                JOptionPane.QUESTION_MESSAGE);
        distanceCycled = Integer.valueOf(distanceStr);
        if(distanceCycled > 10)
            amountRaised = 10 * under10kmRate + (distanceCycled - 10) * over10kmRate;
        else
            amountRaised = distanceCycled * under10kmRate;
        String output = "Name: " + name + "\nDistance cycled: " + distanceCycled +
                "\nSponsorship amount due: €" + amountRaised;
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

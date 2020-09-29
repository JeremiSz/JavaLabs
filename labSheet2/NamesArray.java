package labSheet2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    static String longestName ="";
    static int totalChars=0;
    public static void main(String[] args) {
        String[] names = new String[5];
        populateArray(names);
        Arrays.sort(names);
        String output = "The longest name is " + longestName +
                "\nAverage character per name is " + (totalChars/names.length) +
                "\nThe array in ascending order is\n" + names.toString();
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }

    static void populateArray(String[] topop){
        for (int i = 0; i < topop.length-1; i++) {
            topop[i] = JOptionPane.showInputDialog("Please enter the name of person "+
                    (i + 1));
            if(topop[i].length() > longestName.length()) longestName = topop[i];
            totalChars += topop[i].length();
        }
    }
}

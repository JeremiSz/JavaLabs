package LabSheet2;

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        String output;

        populateArray(numbers);
        output = Arrays.toString(numbers);
        Arrays.sort(numbers);
        output += "\nThe percentage of values above 100 is "+
                (getAbove100(numbers)/numbers.length) +
                "\n" + Arrays.toString(numbers);
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
    static void populateArray(int[] in){
        for (int i = 0; i < in.length -1; i++) {
            in[i] = (int)(Math.random() * 999) +1;
        }
    }

    static float getAbove100(int[] in){
        int out =0;
        System.out.print("poop");
        for (int i = in.length-1; i >= 0; i--) {
            if(in[i] > 100) out++;
            else break;
        }
        return out;
    }
}

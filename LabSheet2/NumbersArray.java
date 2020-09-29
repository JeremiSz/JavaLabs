package LabSheet2;

import javax.swing.*;

public class NumbersArray {
    public static void main(String[] args) {
        double[] numbers = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};
        double average = average(numbers);
        String output = "The largest value is " + largest(numbers) +
                "\nThe average value is " +
                String.format("%.3f",average) +
                "\n" + aboveAverage(numbers,average) +
                " are the values greater than the average";
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }

    static double largest(double[] in){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < in.length - 1; i++) {
            if(max < in[i]) max = in[i];
        }
        return (max == Double.MIN_VALUE)? 0: max;
    }

    static double average(double[] in){
        double total =0;
        for (int i = 0; i < in.length-1; i++) {
            total += in[i];
        }
        return total/in.length;
    }

    static String aboveAverage(double[] in,double average){
        String output = "";
        for (int i = 0; i < in.length -1; i++) {
            if(in[i] > average)
                output += in[i] + " ";
        }
        return output.isEmpty()? "none": output;
    }
}

package labSheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {

        Thermometer t1 = new Thermometer(35);
        String output =t1 + "\n";
        Thermometer t2 = new Thermometer();
        output += t2 + "\n";
        t2.setTemperature(25);
        output += t2;
        JOptionPane.showMessageDialog(null,output);
        String input = JOptionPane.showInputDialog("Enter new temp");
        t2.setTemperature(Integer.valueOf(input));
        JOptionPane.showMessageDialog(null,t2);
        System.exit(0);
    }
}

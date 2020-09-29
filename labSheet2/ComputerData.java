package labSheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {

        String output,cheapestProcessor = "",input,name;
        int count=0,totalMemory=0,value;
        float min = Float.MAX_VALUE,max = Float.MIN_VALUE,price;

        while(true){
            input = JOptionPane.showInputDialog("Please enter the serial number");
            if(input.isEmpty()) break;

            input = JOptionPane.showInputDialog("Please enter the hard-Disk space");
            value = Integer.valueOf(input);
            while(value>=5000 || value <= 50){
                input = JOptionPane.showInputDialog("Please enter a valid space");
                value = Integer.valueOf(input);
            }
            totalMemory += value;

            name = JOptionPane.showInputDialog("Please enter processor type");
            input = JOptionPane.showInputDialog("please enter price");
            price = Float.valueOf(input);
            if(price > max) max = price;
            if(price < min) {
                min = price;
                cheapestProcessor = name;
            }
            count++;
        }

        if(count != 0) {
            output = "The average disk space on the computer processed" +
                    "is: " + averageDiskSpace(totalMemory, count) +
                    "\nThe price range is from €" + String.format("%.2f", min) +
                    " to €" + String.format("%.2f", max) +
                    "\nThe cheapest processor is " + cheapestProcessor;
        }
        else
            output = "No data entered!";
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }

    static int averageDiskSpace(int totalSpace, int computerCount){
        return totalSpace/computerCount;
    }
}

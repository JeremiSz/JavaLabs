package labSheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGUI {
    JFrame window;
    JLabel prelude,smallest,biggest;
    TextField input;
    public NumberGUI(){
        window = new JFrame("Number GUI");
        FlowLayout flow = new FlowLayout();
        window.setLayout(flow);
        window.setSize(500,150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prelude = new JLabel("Please enter your numbers here");
        window.add(prelude);

        input = new TextField(20);
        NumberHandler handle = new NumberHandler();
        input.addActionListener(handle);
        window.add(input);

        biggest = new JLabel("No Numbers entered yet");
        window.add(biggest);

        smallest = new JLabel("");
        window.add(smallest);

        window.setVisible(true);
    }
    public static void main(String[] args) {
        new NumberGUI();
    }

    private class NumberHandler implements ActionListener{
        float smallestNumber = Float.MAX_VALUE,biggestNumber = Float.MIN_VALUE,working;
        @Override
        public void actionPerformed(ActionEvent e) {
            String in = input.getText();
            if(in.isEmpty()){
                window.setVisible(false);
                JOptionPane.showMessageDialog(null,"No input");
                window.setVisible(true);
            }
            else{
                working = Float.parseFloat(in);
                if(working > biggestNumber){
                    biggestNumber = working;
                    biggest.setText("The largest number so far " + biggestNumber);
                }
                if(working < smallestNumber){
                    smallestNumber = working;
                    smallest.setText("Smallest so far is " + smallestNumber);
                }

            }
        }
    }
}

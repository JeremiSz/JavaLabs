package LabSheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeightConverter {
    JFrame window;
    TextField input;
    JLabel text;
    public WeightConverter(){
        window = new JFrame();
        window.setSize(300,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        window.setLayout(flow);
        input = new TextField(5);
        window.add(input);

        TextEventHandler handler = new TextEventHandler();
        input.addActionListener(handler);

        text = new JLabel("");
        window.add(text);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        new WeightConverter();
    }

    static float convertToKG(float pounds){
        return pounds * .454f;
    }

    private class TextEventHandler implements ActionListener {
        String theText;
        float number;
        @Override
        public void actionPerformed(ActionEvent e) {
            theText = input.getText();
            try{
                window.setVisible(false);
                number = Float.parseFloat(theText);
                System.out.print(convertToKG(number));
                text.setText("That is " + String.format("%.2f",convertToKG(number)));
                window.setVisible(true);
            }
            catch (NumberFormatException ne){
                window.setVisible(false);
                JOptionPane.showMessageDialog(null,"You must enter a number\n" +
                        ne.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                window.setVisible(true);
            }
        }
    }
}



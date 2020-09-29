package LabSheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class NamesGUI {
    String[] names = new String[5];
    JFrame window;
    JLabel output;
    JTextField input;
    byte state = 0;
    JButton findLongest;
    JButton search;


    NamesGUI(){
        window = new JFrame();
        window.setSize(500,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name");
        window.add(nameLabel);

        input = new JTextField(20);
        input.addActionListener(new namesHandler());
        window.add(input);

        output = new JLabel("The names array is currently empty! Add names using tet-field above");
        window.add(output);

        window.setVisible(true);


    }

    public static void main(String[] args) {
        new NamesGUI();
    }

    class namesHandler implements ActionListener {
    int count =0;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(state == 0) {
                if (count > 4) {
                    state = 1;
                    window.setVisible(false);
                    window.remove(output);
                    output = null;
                    window.add(search = new JButton("search"));
                    window.add(findLongest = new JButton("longest"));

                    window.setVisible(true);

                } else {
                    names[count] = input.getText();
                    output.setText("Name added! " + (5 - ++count) + "slots remain");
                }
            }
            if(e.getSource() == findLongest)
                JOptionPane.showMessageDialog(null,"The longest name is "+ getLongest(names));
            else if(e.getSource() == search){
                Arrays.sort(names);
                JOptionPane.showMessageDialog(null,"The results are " + binarySearch(names,input.getText()));
            }
            }
        }
    String getLongest(String[] in){
        String longest="";
        for (int i = 0; i < in.length-1; i++) {
            if(longest.length() >= in[i].length()) longest = in[i];
        }
        return longest;
    }

    String binarySearch(String[] names, String searchName) {
        int lowerSub = 0;
        int higherSub = names.length - 1;

        while(lowerSub <= higherSub) {
            int middleSub = (lowerSub + higherSub) / 2;
            if (names[middleSub] != null) {
                if (names[middleSub].compareTo(searchName) < 0) {
                    lowerSub = middleSub - 1;
                } else if (names[middleSub].compareTo(searchName) > 0) {
                    lowerSub = middleSub - 1;
                } else {
                    higherSub = middleSub - 1;
                }
            }
        }
        String output ="";
        for (int i = lowerSub; i <= higherSub; i++) {
            output += names[i];
        }
        return output;
    }



}

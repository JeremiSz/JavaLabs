package labSheet12.exercise1;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayoutWindowEvent extends JFrame {

    private JLabel lb;
    private TextArea ta;

    public BorderLayoutWindowEvent() {
        super("Demonstrating BorderLayout & WindowEvent");

        BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);

        String regions[] = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
                BorderLayout.WEST, BorderLayout.CENTER};

        lb = new JLabel("Please enter your text on the text-area below");
        add(lb,BorderLayout.NORTH);
        ta = new TextArea(5,5);
        //ta.setLineWrap(true);
        //ta.setWrapLineStyle(true);
        ta.setForeground(Color.BLUE);

        add(ta,BorderLayout.CENTER);

        addWindowListener(new WindowEventHandler());
        setSize(400, 300);

        setVisible(true);
    }


    public static void main(String args[]) {
        BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
    }

    private class WindowEventHandler implements WindowListener {

        public void windowOpened(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Welcome (insert long welcome message here)", "Opening Window",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        //hides the window on closing by default (so application is still actually running in background)
        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Now closing window", "Closing Window",
                    JOptionPane.INFORMATION_MESSAGE);
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION);

            if(choice==JOptionPane.YES_OPTION)
                dispose();
        }

        //method only called when dispose() is called on the relevant window from elsewhere
        public void windowClosed(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window Closed (Disposed)", "Window Closed (Disposed)",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        public void windowIconified(WindowEvent e) {
            String input = ta.getText();
            char current,previous=' ';
            int vowel=0,letter=0,digit=0,word=0,sentences=0,wordEndingInD=0;
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                current = input.charAt(i);
                if(Character.isLetter(current)) {
                    letter++;
                    if (current == 'a' || current == 'i' || current == 'e' || current == 'o' || current == 'u')
                        vowel++;
                }
                else if(Character.isDigit(current))
                    digit++;
                else if(current == '.'){
                    word++;
                    sentences++;
                    if(previous == 'd')
                        wordEndingInD++;
                }
                else{
                    word++;
                    if(previous == 'd')
                    wordEndingInD++;
                }
                previous = current;
            }
            String output = "num of characters " + input.length() +
                    "\nnum of vowels " + vowel +
                    "\nnum of letters " + letter +
                    "\nnum of digits " + digit +
                    "\nnum of words " + word +
                    "\nnum of sentences " + sentences +
                    "\nnum of words ending in d " + wordEndingInD;
             JOptionPane.showMessageDialog(null, output, "Window Minimised",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        public void windowDeiconified(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Window Unminimised", "Window Unminimised",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        public void windowActivated(WindowEvent e) {
             //better to use console here to prevent logical error
            System.out.println("Window Activated");
        }


        public void windowDeactivated(WindowEvent e) {
            //better to use console here to prevent logical error
            System.out.println("Window Deactivated");
        }
    }
}

package labSheet4.exercise4;

import javax.swing.*;

public class TextBook {
    public static void main(String[] args) {
        Book B1 = new Book();
        Book B2 = new Book("The Davinci Code",19.99,"3452617232",348);
        JOptionPane.showMessageDialog(null,"argumentless\n" +
                B1 + "\nwith arguments\n" + B2);
        System.exit(0);
    }
}

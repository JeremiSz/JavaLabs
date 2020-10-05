package labSheet5.exercise1;

import javax.swing.*;
import labSheet3.computer;

public class TextBook {
    public static void main(String[] args) {
        Book B1 = new Book();
        Book B2 = new Book("The Davinci Code",19.99,"3452617232",348);
        JOptionPane.showMessageDialog(null,"argumentless\n" +
                B1 + "\nwith arguments\n" + B2);

        computer c1 = new computer();
        //System.out.println(c1.getManugacturer());
        System.exit(0);
    }
}

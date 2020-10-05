package labSheet6.exercise1;

import javax.swing.*;

public class testPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        String working = JOptionPane.showInputDialog("Please give first name");
        p2.setFirstName(working);
        working = JOptionPane.showInputDialog("Please give last name");
        p2.setLastName(working);
        working = "\n" + p1 + "\n" + p2;
        JOptionPane.showMessageDialog(null,working);
        System.exit(0);
    }
}

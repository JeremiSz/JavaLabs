package labSheet4.exercise4;

import javax.swing.*;

public class library {

    public static void main(String[] args) {
        String output = "Title Price ISBN Pages\n";

        String title = JOptionPane.showInputDialog("Title of fav book");
        double price = Double.valueOf(JOptionPane.showInputDialog("Price of fav book"));
        String ISBN = JOptionPane.showInputDialog("ISBN of fav book");
        int pages = Integer.valueOf(JOptionPane.showInputDialog("number of pages in fav book"));

        output += new Book(title,price,ISBN,pages);

        title = JOptionPane.showInputDialog("Title of least fav book");
        price = Double.valueOf(JOptionPane.showInputDialog("Price of least fav book"));
        ISBN = JOptionPane.showInputDialog("ISBN of least fav book");
        pages = Integer.valueOf(JOptionPane.showInputDialog("number of pages in least fav book"));

        output += "\n" + new Book(title,price,ISBN,pages);
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }
}

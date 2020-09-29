package labSheet1;

import javax.swing.*;

public class NumberMenu {
    public static void main(String[] args) {
        int index =0,numberIn;
        String numberStr;

        do{
            numberStr = JOptionPane.showInputDialog("Iteration " +
                    (index + 1) + "\nPlease enter any whole number");
            numberIn = Integer.parseInt(numberStr);

            numberStr = JOptionPane.showInputDialog("1.even or odd\n2.Find factorial\n3.Quit");
            switch (numberStr){
                case("1"):
                    JOptionPane.showMessageDialog(null,"The number you entered is" +
                            (numberIn%2==0? "even" : "odd"));
                    break;
                case("2"):
                    if(numberIn<0)
                        JOptionPane.showMessageDialog(null,"negetives don't have factorials");
                    else
                        JOptionPane.showMessageDialog(null,"The factorial of the number you entered is " +
                            getFactorial(numberIn));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Exitting");
                    System.exit(0);
                    break;
            }
        }while (++index < 10);
        System.exit(0);
    }
    static float getFactorial(int in){
        float total = in;
        for (int i = 1; i < in; i++) {
           total *= in-i;
        }
        return total;
    }
}

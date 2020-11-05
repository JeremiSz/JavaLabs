package labSheet11.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrayList{
    public static void main(String[] args) {
/*
        System.out.println("\n\nCreating two array-lists, one to maintain a collection of products,\n" +
                "the other to maintain a collection of line-items ...\n");
        //Create an array-list of LineItem objects
        ArrayList<LineItem> allLineItems = new ArrayList<LineItem>();

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>();


        // Create Products
        Product p1 = new Product(1, "Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Marker", "This is a black permanent marker");

        allProducts.add(p1);
        allProducts.add(p2);
        allProducts.add(p3);
        allProducts.add(p4);


        // Create LineItem objects

        LineItem item1 = new LineItem(1, 3, p1);
        LineItem item2 = new LineItem(2, 4, p2);
        LineItem item3 = new LineItem(3, 2, p3);

        allLineItems.add(item1);
        allLineItems.add(item2);
        allLineItems.add(item3);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");

        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);


        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nNow removing the first line-item from its array-list...\n\n");
        allLineItems.remove(0);

        System.out.println("Displaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nCreating a new product, a compass, and adding it to the array-list of products\n");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        allProducts.add(p5);

        LineItem item4 = new LineItem(4, 5, p5);

        System.out.println("\nNow adding a new line-item, for 5 compasses, to end of its array-list...\n");
        allLineItems.add(item4);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");

        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nDisplaying the state of all line-items which contain products beginning with 'Pen' ...\n\n");
        for (LineItem l : allLineItems)
            if (l != null && l.getProduct().getName().startsWith("Pen"))
                System.out.println(l);

        System.out.println("\n\nNow changing product of the line-item in the 2nd position of the array-list from a ruler to a black permanent marker...");
        allLineItems.get(1).setProduct(p4);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\nNow removing the 2nd product, the pencil, from the array-list of products...\n\n");
        allProducts.remove(1);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");
        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);
*/
        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

//Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));
        openMenu(allProducts);
    }
    public static void openMenu(ArrayList<Product> allProducts){
        String output;
        String layout = "1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Product\n5. Quit";
        output = JOptionPane.showInputDialog(null,layout,"Input",JOptionPane.QUESTION_MESSAGE);

        switch (output.charAt(0)){
            case('1'):
                addProduct(allProducts);
                break;
            case ('2'):
                amendProduct(allProducts);
                break;
            case ('3'):
                removeProduct(allProducts);
                break;
            case ('4'):
                viewProducts(allProducts);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Thanks for using the system","Farewell",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
    }
    public static void addProduct(ArrayList<Product> allProducts){
        int id;
        String name,description;

        String working;
        working = JOptionPane.showInputDialog(null,"product ID","Input",JOptionPane.QUESTION_MESSAGE);
        id = Integer.parseInt(working);

        name = JOptionPane.showInputDialog(null,"name","Input",JOptionPane.QUESTION_MESSAGE);
        description = JOptionPane.showInputDialog(null,"description","Input",JOptionPane.QUESTION_MESSAGE);
        allProducts.add(new Product(id,name,description));
        JOptionPane.showMessageDialog(null,"Added");
        openMenu(allProducts);
    }
    public static void amendProduct(ArrayList<Product> allProducts){
        String name,working;
        int id;
        ArrayList<Product> foundPs = new ArrayList<>();
        Product foundP = null;

        name = JOptionPane.showInputDialog(null,"search name","search",JOptionPane.QUESTION_MESSAGE);
        String message = "Found\n";
        Iterator<Product> iterator = allProducts.iterator();
        while (iterator.hasNext()){
            Product p = iterator.next();
            if(p.getName().contains(name)) {
                foundPs.add(p);
                message += p.toString() + "\n";
            }
        }
        message += "enter ID";

        working = JOptionPane.showInputDialog(null,message,"Input",JOptionPane.QUESTION_MESSAGE);
        id = Integer.parseInt(working);
        for (Product p: foundPs) {
            if(p.getId() == id) {
                foundP = p;
            break;
            }
        }
        if(foundP != null) {
            message = foundP.toString() + "\n1. Name\n2. Description\n3. Cancel";
            working = JOptionPane.showInputDialog(null,message,"Input",JOptionPane.QUESTION_MESSAGE);
            switch (Integer.valueOf(working)){
                case (1):
                    ammendName(foundP);
                    break;
                case (2):
                    ammendDescription(foundP);
                    break;
                default:
                    break;
            }
            openMenu(allProducts);
        }
    }
    private static void ammendName(Product p){
        String name;
        name = JOptionPane.showInputDialog(null,"new name","input",JOptionPane.QUESTION_MESSAGE);
        p.setName(name);
    }
    private static void ammendDescription(Product p){
        String description;
        description = JOptionPane.showInputDialog(null,"new description","input",JOptionPane.QUESTION_MESSAGE);
        p.setDescription(description);
    }

    public static void removeProduct(ArrayList<Product> allProducts){
        String name,working;
        int id;
        ArrayList<Product> foundPs = new ArrayList<>();
        Product foundP = null;

        name = JOptionPane.showInputDialog(null,"search name","search",JOptionPane.QUESTION_MESSAGE);
        String message = "Found\n";
        Iterator<Product> iterator = allProducts.iterator();
        while (iterator.hasNext()){
            Product p = iterator.next();
            if(p.getName().contains(name)) {
                foundPs.add(p);
                message += p.toString() + "\n";
            }
        }
        message += "enter ID";

        working = JOptionPane.showInputDialog(null,message,"Input",JOptionPane.QUESTION_MESSAGE);
        id = Integer.parseInt(working);
        for (Product p: foundPs) {
            if(p.getId() == id) {
                foundP = p;
                break;
            }
        }
        allProducts.remove(foundP);
        openMenu(allProducts);
    }
    public static void viewProducts(ArrayList<Product> allProducts){
        String message = "";
        for (Product p:allProducts) {
            message += p.toString();
        }
        JOptionPane.showMessageDialog(null,message,"List of products",JOptionPane.QUESTION_MESSAGE);
        openMenu(allProducts);
    }

}

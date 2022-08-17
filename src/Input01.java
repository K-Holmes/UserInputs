import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String userInput = JOptionPane.showInputDialog("Something");
        System.out.println(userInput);

        //Parse the input as an int.
        //Print its value +1
        int intInput = Integer.parseInt(userInput);
        intInput++;
        System.out.println(intInput);


        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int intInputs = Integer.parseInt(JOptionPane.showInputDialog("Something"))+1;
        System.out.println(intInputs);


    }
}

import org.w3c.dom.ls.LSOutput;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "You're about to take a quick survey",
                "Alert",
                0);


        String userName = (String)JOptionPane.showInputDialog(null,
                "What is your name",
                "Name Prompt",
                1,
                null,
                null,
                "Your name here.");


        String[] acceptableValues = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Brown", "Grey", "Black", "White", "Teal", "Pink", };
        String colorChoice = (String)JOptionPane.showInputDialog(null,
                "What is your favorite color?",
                "Color Select",
                2,
                null,
                acceptableValues,
                acceptableValues[0]);
        System.out.println("Name: "+ userName);
        System.out.println("Favorite Color: " + colorChoice);

    }

}

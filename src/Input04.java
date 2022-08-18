import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));
//
//        while (sc.hasNextLine()) {
//            while (sc.hasNextInt()) {
//                int x = sc.nextInt();
//                System.out.println(x);
//            }
//
//        }

        //Edit these lines to advance the scanner
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();



        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int xPos = sc.nextInt();
        int yPos = sc.nextInt();


        System.out.println("X: " + xPos + ", Y: " + yPos );
        sc.close();
    }
}

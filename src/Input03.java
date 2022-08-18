import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        int numOne, numTwo, numThree, sum;

        //Find and print the sum of three integers entered by the user
        System.out.println("Please give three numbers for adding. Enter number 1 here: ");
        numOne = sc.nextInt();
        System.out.println("Please enter number 2: ");
        numTwo = sc.nextInt();
        System.out.println("Please enter number 3: ");
        numThree = sc.nextInt();

        sum = numOne+numTwo+numThree;
        System.out.println(numOne + " + " + numTwo + " + " + numThree + " = " + sum);


        //Remember to close the Scanner
        sc.close();

    }
}

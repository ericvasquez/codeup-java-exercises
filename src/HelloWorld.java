import javax.swing.JOptionPane;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double pi = 3.14159;

        int myFavoriteNumber = 3;
        String myString = "My favorite number is: ";
        long myNumber = 123L;

//        //uses two lines of code to print message on  a single line instead of one
//        System.out.print("Hello, ");
//        System.out.println("World!");
//
//        //prints message in popup
//       // JOptionPane.showMessageDialog(null, "Hello, World!");
//
//
//
//        System.out.println(myFavoriteNumber);
//        //.JOptionPane.showMessageDialog(null, myFavoriteNumber);
//
//        System.out.println(myString);
//
//       // JOptionPane.showMessageDialog(null, myString);
//
//        System.out.println(myNumber);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int x = 4;
//       x += 5;
//       System.out.println(x);
//
//        int x = 3;
//        int y = 4;
//        y *=x;
//        System.out.println(y);
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//
//        System.out.println(y);


        System.out.format("The value of pi is approximately %.2f", pi);
        System.out.println();

        System.out.print("Enter an integer: ");
        int userInput = scan.nextInt();
        scan.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");




    //Asks the user for three words, stores them separately and the prints all of them
        System.out.println("Enter a word");
        String firstWord = scan.nextLine();

        System.out.println("Enter a second word");
        String secondWord = scan.nextLine();

       System.out.println("Enter a third word");
       String thirdWord = scan.nextLine();
//prints all three words
        System.out.println("Your words are: " + firstWord + " " + secondWord + " " + thirdWord);


//asks the user for length and width
        System.out.println("Enter the width of the classroom: ");
        double width = scan.nextDouble();

        System.out.println("Enter the length of the classroom: ");
        double length = scan.nextDouble();
//gets the area and perimeter
        double area = length * width;
        double perimeter = (2*length)+(2*width);
//prints area and perimeter
        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);



        int IntUserInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
        JOptionPane.showMessageDialog(null, "You entered: " + IntUserInput);
        JOptionPane.showInputDialog("Enter a word: ");
        JOptionPane.showInputDialog("Enter a 2nd word: ");
        JOptionPane.showInputDialog("Enter a 3rd word: ");

        JOptionPane.showMessageDialog(null, "Your words are: " + firstWord + " " + secondWord + " " + thirdWord);

        int IntWidth = Integer.parseInt(JOptionPane.showInputDialog("Enter the width: "));
        int IntLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the length: "));
        int IntArea = IntLength * IntWidth;
        int IntPerimeter = (2*IntLength)+(2*IntWidth);

        JOptionPane.showMessageDialog(null, "The area of the classroom is: " + IntArea);
        JOptionPane.showMessageDialog(null, "The perimeter of the classroom is: " + IntPerimeter);

    }
}

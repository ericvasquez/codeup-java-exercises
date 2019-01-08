import javax.swing.JOptionPane;
import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


//        int i = 5;
//        while (i<=15){
//            System.out.print(i + " ");
//            i++;
//        }


//        for(int i = 5; i<=15; i++)
//            System.out.print(i + " ");
//        System.out.println();
////        int number = 2;
////        do {
////            System.out.println(number);
////            number+=2;
////        }while (number<=100);
//
//        for(int number = 2; number<=100; number+=2)
//            System.out.println(number + " ");
//
//
//

//int newNumber = 100;
//do{
//    System.out.println(newNumber);
//    newNumber-=5;
//}while (newNumber>=-10);
//
//for(int newNumber = 100; newNumber>=-10; newNumber-=5)
//    System.out.println(newNumber);
//
//
////        long numberSquared = 2;
////        do{
////            System.out.println(numberSquared);
////            numberSquared*=numberSquared;
////        }while (numberSquared<1000000);
////
//for(long numberSquared = 2; numberSquared<1000000; numberSquared*=numberSquared)
//    System.out.println(numberSquared);

//for(int fb = 1; fb<=100; fb++){
//    if(fb%3==0 && fb%5==0){
//        System.out.println("FizzBuzz");
//        continue;}
//
//    if(fb%3==0){
//        System.out.println("Fizz");
//        continue;}
//
//    if(fb%5==0){
//        System.out.println("Buzz");
//        continue;}
//
//    else
//        System.out.println(fb);

//}


//        boolean answer = true;
//        while(answer == true){
//            System.out.println("What number would you like to go up to? ");
//            int highestNumber = scan.nextInt();
//
//
//            System.out.println("Here is your table!");
//            System.out.println("Number  |  Squared  |  Cubed");
//            System.out.println("------  |  -------  |  -----");
//
//
//            for(int startingNumber = 1; startingNumber<=highestNumber; startingNumber++) {
//                int startingNumberSq = startingNumber * startingNumber;
//                int startingNumberCu = startingNumber * startingNumber * startingNumber;
//                System.out.println(startingNumber + "       |  " + startingNumberSq + "        |  " + startingNumberCu);
//
//            }
//            scan.nextLine();
//
//
//        System.out.println("Would you like to continue? Y or N?");
//        String newAnswer = scan.nextLine();
//
//        if(newAnswer.equalsIgnoreCase("Y"))
//            answer=true;
//        else
//            answer=false;
//    }
String gradeLetter = "";
        boolean gradeAnswer = true;
        while(gradeAnswer == true){

            System.out.println("What is the grade? ");
            int grade = scan.nextInt();

            if(grade<=100 && grade>=90)
            gradeLetter="A";

            if(grade<=89 && grade>=80)
            gradeLetter="B";

            if(grade<=79 && grade>=70)
            gradeLetter="C";

            if(grade<=69 && grade>=60)
            gradeLetter="C";

            if(grade<=59)
            gradeLetter="F";

            System.out.println("Your grade is: " + gradeLetter);

            scan.nextLine();


            System.out.println("Would you like to continue? Y or N?");
            String gradeNewAnswer = scan.nextLine();

            if(gradeNewAnswer.equalsIgnoreCase("Y"))
                gradeAnswer=true;
            else
                gradeAnswer=false;
        }


    }
}

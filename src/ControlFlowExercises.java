import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        int i = 5;
        while (i<=15){
            System.out.print(i + " ");
            i++;
        }


        for(int i2 = 5; i2<=15; i2++)
            System.out.print(i + " ");
        System.out.println();
        int number = 2;
        do {
            System.out.println(number);
            number+=2;
        }while (number<=100);

        for(int number2 = 2; number2<=100; number2+=2)
            System.out.println(number2 + " ");




int newNumber = 100;
do{
    System.out.println(newNumber);
    newNumber-=5;
}while (newNumber>=-10);

for(int newNumber2 = 100; newNumber2>=-10; newNumber2-=5)
    System.out.println(newNumber2);


//        long numberSquared = 2;
//        do{
//            System.out.println(numberSquared);
//            numberSquared*=numberSquared;
//        }while (numberSquared<1000000);
//
for(long numberSquared = 2; numberSquared<1000000; numberSquared*=numberSquared)
    System.out.println(numberSquared);

for(int fb = 1; fb<=100; fb++){
    if(fb%3==0 && fb%5==0){
        System.out.println("FizzBuzz");
        continue;}

    if(fb%3==0){
        System.out.println("Fizz");
        continue;}

    if(fb%5==0){
        System.out.println("Buzz");
        continue;}

    else
        System.out.println(fb);

}


        boolean answer = true;
        while(answer == true){
            System.out.println("What number would you like to go up to? ");
            int highestNumber = scan.nextInt();


            System.out.println("Here is your table!");
            System.out.println("Number  |  Squared  |  Cubed");
            System.out.println("------  |  -------  |  -----");


            for(int startingNumber = 1; startingNumber<=highestNumber; startingNumber++) {
                int startingNumberSq = startingNumber * startingNumber;
                int startingNumberCu = startingNumber * startingNumber * startingNumber;
                System.out.println(startingNumber + "       |  " + startingNumberSq + "        |  " + startingNumberCu);

            }
            scan.nextLine();


        System.out.println("Would you like to continue? Y or N?");
        String newAnswer = scan.nextLine();

        if(newAnswer.equalsIgnoreCase("Y"))
            answer=true;
        else
            answer=false;
    }
String gradeLetter = "";
        boolean gradeAnswer = true;
        while(gradeAnswer == true){

            System.out.println("What is the grade? ");
            int grade = scan.nextInt();

            if(grade<=100 && grade>=88)
            gradeLetter="A";

            if(grade<=87 && grade>=80)
            gradeLetter="B";

            if(grade<=79 && grade>=67)
            gradeLetter="C";

            if(grade<=66 && grade>=60)
            gradeLetter="D";

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

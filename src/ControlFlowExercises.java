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


        for(int i = 5; i<=15; i++)
            System.out.print(i + " ");
        System.out.println();
//        int number = 2;
//        do {
//            System.out.println(number);
//            number+=2;
//        }while (number<=100);

        for(int number = 2; number<=100; number+=2)
            System.out.println(number + " ");




//int newNumber = 100;
//do{
//    System.out.println(newNumber);
//    newNumber-=5;
//}while (newNumber>=-10);

for(int newNumber = 100; newNumber>=-10; newNumber-=5)
    System.out.println(newNumber);


//        long numberSquared = 2;
//        do{
//            System.out.println(numberSquared);
//            numberSquared*=numberSquared;
//        }while (numberSquared<1000000);
//
for(long numberSquared = 2; numberSquared<1000000; numberSquared*=numberSquared)
    System.out.println(numberSquared);

    }
}

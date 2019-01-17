import java.util.Scanner;

public class Bob {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
int y;

    String bobAnswerQuestion = ("Sure.");
    String bobAnswerYell = ("Whoa, chill out!");
    String bobAnswerNothing = ("Fine, be that way!");
    String bobAnswerAnything = ("Whatever");


        System.out.println("What do you want to say to Bob");
    String messageToBob = scan.nextLine();
   y=messageToBob.length();

    char punctuation = messageToBob.charAt(y-1);

if(punctuation=='?')
        System.out.println(bobAnswerQuestion);

    if(punctuation=='!')
    System.out.println(bobAnswerYell);
    if(punctuation==' ')
    System.out.println(bobAnswerNothing);
   else
    System.out.println(bobAnswerAnything);


}
   }
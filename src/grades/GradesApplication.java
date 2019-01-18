package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();



        students.put("Gitname1", new Student("Name1"));
        students.get("Gitname1").addGrade(41);
        students.get("Gitname1").addGrade(23);
        students.get("Gitname1").addGrade(13);

        students.put("Gitname2", new Student("Name2"));
        students.get("Gitname2").addGrade(54);
        students.get("Gitname2").addGrade(75);
        students.get("Gitname2").addGrade(72);

        students.put("Gitname3", new Student("Name3"));
        students.get("Gitname3").addGrade(44);
        students.get("Gitname3").addGrade(743);
        students.get("Gitname3").addGrade(73);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the github usernames of our students: ");

        String usernames = "";
        for(String user : students.keySet()){
            usernames += " | " + user + " | ";
        }
        System.out.println(usernames);



do {
    String username = input.getString("Who do you want to see? \n");
    if(students.containsKey(username)) {
        System.out.println("\n Name: " + students.get(username).getName() + "-Github username: " + username);
        System.out.println("Average: " + students.get(username).getGradeAverage() + "\n");
    }
    else
                   System.out.println("There is no one with the name of " + username);
    System.out.println();


}while (input.yesNo("Would you like to see someone else: \n"));
        System.out.println("Okay");




        }
    }


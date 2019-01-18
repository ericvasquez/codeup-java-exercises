package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();

        Student student2 = new Student("Name1");

        student2.addGrade(55);
        student2.addGrade(55);
        student2.addGrade(55);

        Student student3 = new Student("Name2");

        student3.addGrade(56);
        student3.addGrade(78);
        student3.addGrade(59);

        Student student4 = new Student("Name3");

        student4.addGrade(66);
        student4.addGrade(83);
        student4.addGrade(99);

        Student student5 = new Student("Name3");

        student5.addGrade(65);
        student5.addGrade(97);
        student5.addGrade(55);


        students.put(student2.getStudentsName(), student2);
        students.put(student3.getStudentsName(), student3);
        students.put(student4.getStudentsName(), student4);

        System.out.println(students.get(students));
        for (int i = 0; i < 100; i++) {
            System.out.println("Who do you want to see?");
            String answer = input.getString();

            if (answer.equals(student2.getStudentsName()))
                System.out.println(student2.getGradeAverage());

            if (answer.equals(student3.getStudentsName()))
                System.out.println(student3.getGradeAverage());

            if (answer.equals(student4.getStudentsName()))
                System.out.println(student4.getGradeAverage());

            if (answer.equals(student5.getStudentsName()))
                System.out.println(student5.getGradeAverage());

            else {
                System.out.println("There is no one with the name of " + answer);
                System.out.println("would you like to see someone else? ");
                boolean answers = input.yesNo();
                if (answers) {
                    i = 0;

                } else
                    i =101;
            }


        }
    }
}
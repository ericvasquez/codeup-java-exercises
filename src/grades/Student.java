package grades;

import java.util.ArrayList;

public class Student {


    private String studentsName;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.studentsName = name;
        this.grades = new ArrayList<>();
    }


    public Student(String name, ArrayList<Integer> grades) {
        this.studentsName = name;
        this.grades = grades;

    }


    public String getStudentsName() {
        return this.studentsName;
    }



    // adds the given grade to the grades property
    public void addGrade(int grade){


        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){


        double avg = 0;
        for (int i = 0; i < grades.size(); i++) {
            avg += grades.get(i);
        }
        return (int) Math.round(avg / grades.size());

    }

    public String toString() {
        return this.studentsName + "'s grades: of " + this.grades;
    }


    public static void main(String[] args){

        Student student1 = new Student("kjdfkng");

        student1.addGrade(50);
        student1.addGrade(50);
        student1.addGrade(100);
        student1.addGrade(100);

        System.out.println(student1+ " has average of: "+ student1.getGradeAverage());
    }
}

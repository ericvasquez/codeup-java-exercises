package grades;

import java.util.ArrayList;

public class Student {


    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;

    }

//returns the Student's name
    public String getName() {
        return this.name;
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

            //for (int grade : grades){
            // avg +=grade;
            // }
        }
        // return avg/grades.size();
        if(grades.size()==0)
            return 0;
        else
        return (int) Math.round(avg / grades.size());
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

import java.util.Scanner;



public class Person {
    private String name;

    public Person(String name){
        setName(name);
    }



    public String getName(){
        return name;
    }

    public void setName(String name){
this.name=name;

    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }


    public static void main(String[] args){

Person person1 =  new Person("Some Guy");
        System.out.println("The person's name is:" + person1.getName());
        person1.sayHello();



    }
}

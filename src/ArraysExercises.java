import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//creates new array named people using Person class to create 3 Person Objects
       Person[] people = new Person[3];

       people[0]=new Person("Person1");
        people[1]=new Person("Person2");
        people[2]=new Person("Person3");
//Prints all elements in people Array
        for(Person person:people){
            System.out.println(person.getName());
        }
        //To separate the two outputs
        System.out.println();
//Creates new person
       Person person4 = new Person("person4");
//Calls addPerson method
   Person[] addedPerson = addPerson(people,person4);
   //Prints all elements with added person at the end
        for(Person person:addedPerson){
            System.out.println(person.getName());
        }
}
//Method to copy people array, add space, and add person
    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] newPeople =Arrays.copyOf(people,people.length+1);
        newPeople[newPeople.length-1]=newPerson;
        return newPeople;

    }
}

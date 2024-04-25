package Homework.lesson13;

import java.util.Arrays;

public class PersonsList {

    private Person[] people = new Person[5];
    private int count = 0;

    public void add(Person person) {
        if (person == null) {
            System.err.println("Person is not initialized");
            return;
        }
        if(count == people.length){
            addCapacity();
        }
        people[count++] = person;
    }
    public void addCapacity(){
        int capacity = people.length + 5;
        Person[] capacityArray = new Person[capacity];
        System.arraycopy(people, 0, capacityArray, 0, people.length);
        people = capacityArray;
    }
    public void remove(int index){
        if (checkArrayBounds(index)){
            System.err.println("Array index out of bounds exception");
            return;
        }
        Person[] newArray = new Person[people.length - 1];
        for (int i = 0; i < newArray.length; i++){
            if (i < index){
                newArray[i] = people[i];
            } else {
                newArray[i] = people[i + 1];
            }
//            newArray[i] = people[i < index ? i : i + 1];
        }
        people = newArray;
    }

    public void setPerson(int index, Person person){
        if (checkArrayBounds(index) || person == null){
            System.err.println("Array index out of bounds exception or person wasn't initialized");
            return;
        }
        people[index] = person;
    }

    public Person getPerson(int index){
        if (checkArrayBounds(index)){
            System.err.println("Array index out of bounds exception");
            return null;
        }
        return people[index];
    }

    private boolean checkArrayBounds(int index){
        return index >= people.length || index < 0;
    }

    public void printArray(){
        for (Person person : people) System.out.println(person);
//        System.out.println(Arrays.toString(people));
//Так звісно легше, але я не хотів щоб вся інформація з масиву була в одному рядку.
    }
}

package Homework.lesson13;

public class PersonTest {
    public static void main(String[] args){
        PersonsList personsList = new PersonsList();
        Person placeholder = new Person(2003, "Anton");
        for(int i = 0; i < 9; i++){
            personsList.add(placeholder);
        }
        personsList.printArray();
    }
}

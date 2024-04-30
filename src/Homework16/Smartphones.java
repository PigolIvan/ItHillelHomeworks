package Homework16;
import java.util.Scanner;
public interface Smartphones {
    void Call();
    void Sms();
    void Internet();
}
class Android implements Smartphones{
    Scanner scanner;
    public Android(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    public void Call(){
        System.out.println("Введіть номер телефону"); //можливий любий просто щоб класс виповнився
        String number = scanner.next();
        System.out.println("Дзвонимо по номеру " + number + "...");
        System.out.println("Абонент поза зоною!");
    }
    @Override
    public void Sms(){
        System.out.print("Введіть повідомлення: ");
        String message = scanner.next();
        System.out.println("\033[3mВідправлено!\033[0m");
    }
    public void Internet(){
        System.out.println("Пробуємо під'єднатися до мережі...");
    }
    public void LinuxOS(){
        System.out.println("You are using latest Linux Kernel build [6.8.8]!");
    }
}
class IPhone implements Smartphones{
    Scanner scanner;
    public IPhone(Scanner scanner){
        this.scanner = scanner;
    }
    public void Call(){
        System.out.println("Введіть номер телефону");
        String number = scanner.next();
        System.out.println("Відтворюється виклик до  " + number + "...");
        System.out.println("Невдалося з'єднатися!");
    }
    @Override
    public void Sms(){
        System.out.print("Введіть повідомлення: ");
        String message = scanner.next();
        System.out.println("\033[3mВідправлено!\033[0m");
    }
    public void Internet(){
        System.out.println("Немає зв'язку.");
    }
    public void IOS(){
        System.out.println("Your phone is using IOS 17.4.1");
    }
}
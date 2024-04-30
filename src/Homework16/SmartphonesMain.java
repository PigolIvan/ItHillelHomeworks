package Homework16;
import java.util.Scanner;
public class SmartphonesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Android samsung = new Android(scanner);
        IPhone iphone = new IPhone(scanner);
        samsung.Call();
        samsung.Sms();
        samsung.Internet();
        samsung.LinuxOS();
        System.out.println();
        iphone.Call();
        iphone.Sms();
        iphone.Internet();
        iphone.IOS();
    }

}

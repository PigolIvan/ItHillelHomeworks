package Homework15;

import java.util.Scanner;

public abstract class AreaCalculator {
//Який саме трикутник потрібен для вичислення сказаний не був. Тому я зробив більшість)

    protected abstract void calcSomething();

    protected abstract String getTask();

}
class CalcCircle extends AreaCalculator {
    private final Scanner scanner;

    public CalcCircle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    protected void calcSomething() {
        System.out.print("Введіть радіус круга: ");
        double radius = scanner.nextDouble() + '\n';
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площа круга: " + area + "см^2");
    }

    @Override
    protected String getTask(){
        return "Порахувати площу круга.";
        }
}
class CalcRectangle extends AreaCalculator {
    private final Scanner scanner;

    public CalcRectangle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    protected void calcSomething() {
        System.out.print("Введіть довжину: ");
        double length = scanner.nextDouble() + '\n';
        System.out.print("Введіть ширину: ");
        double width = scanner.nextDouble() + '\n';
        double area = width * length;
        System.out.println("Площа прямокутника: " + area + "см^2");
    }
    @Override
    protected String getTask() {
        return "Порахувати площу прямокутника";
    }
}

class CalcSquare extends AreaCalculator {
    private final Scanner scanner;

    public CalcSquare(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    protected void calcSomething() {
        System.out.println("Введіть сторону квадрата: ");
        double side = scanner.nextDouble() + '\n';
        double area = Math.pow(side, 2);
        System.out.println("Площа квадрату: " + area + "см^2");
    }
    @Override
    protected String getTask() {
        return "Порахувати площу квадрата.";
    }
}

class CalcTriangle extends AreaCalculator {
//Трикутник, у якого всі сторони рівні.

    private final Scanner scanner;

    public CalcTriangle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    protected void calcSomething() {
        System.out.print("Введіть сторону трикутника: ");
        double side = scanner.nextDouble() + '\n';
        double area = (Math.pow(side, 2) + Math.sqrt(3)) / 4;
        System.out.println("Площа трикутника: " + area + "см^2");
    }

    @Override
    protected String getTask() {
        return "Порахувати площу правильного трикутника";
    }
}

class CalcRightTriangle extends AreaCalculator {
//Площа прямокутного трикутника

    private final Scanner scanner;

    public CalcRightTriangle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    protected void calcSomething() {
        System.out.print("Введіть перший катет: ");
        double side_1 = scanner.nextDouble() + '\n';
        System.out.print("Введіть другий катет: ");
        double side_2 = scanner.nextDouble() + '\n';
        double area = (side_1 * side_2) / 2;
        System.out.println("Площа прямокутного трикутника: " + area + "см^2");
    }

    @Override
    protected String getTask() {
        return "Порахувати площу прямокутного трикутника.";
    }
}

class CalcDullTriangle extends AreaCalculator {
//Це міг бути рівнобедренний, але його можна і обчислити через прямокутний трикутник.

    private final Scanner scanner;

    public CalcDullTriangle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    protected void calcSomething() {
        System.out.print("Введіть основу трикутника: ");
        double backbone = scanner.nextDouble() + '\n';
        System.out.print("Введіть висоту трикутника: ");
        double height = scanner.nextDouble() + '\n';
        double area = (backbone * height) / 2;
        System.out.println("Площа тупокутного трикутника: " + area  + "см^2");
    }

    @Override
    protected String getTask() {
        return "Порахувати площу тупокутного трикутника";
    }
}

class CalcVersatileTriangle extends AreaCalculator {
//різностронній

    private final Scanner scanner;

    public CalcVersatileTriangle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    protected void calcSomething() {
        System.out.print("Введіть першу сторону: ");
        double side_1 = scanner.nextDouble() + '\n';
        System.out.print("Введіть другу сторону: ");
        double side_2 = scanner.nextDouble() + '\n';
        System.out.print("Введіть третю сторону: ");
        double side_3 = scanner.nextDouble() + '\n';
        //p - півпериметр, використовується в формулі Герона
        //p = (a + b + c)/2
        double p = (side_1 + side_2 + side_3) / 2;
        double area = Math.sqrt(p * (p - side_1) * (p - side_2) * (p - side_3));
        System.out.println("Площа різностороннього трикутника: " + area + "см^2");
    }

    @Override
    protected String getTask() {
        return "Порахувати площу різностороннього трикутника.";
    }
}
class CalcParallelogram extends AreaCalculator {
    private final Scanner scanner;
    public CalcParallelogram(Scanner scanner){this.scanner = scanner;}

    @Override
    protected void calcSomething() {
        System.out.println("Введіть сторону: ");
        double side = scanner.nextDouble() + '\n';
        System.out.println("Введіть висоту проведену до цьої сторони: ");
        double height = scanner.nextDouble() + '\n';
        double area = side * height;
        System.out.println("Площа паралелограма: " + area + "см^2");
    }
    @Override
    protected String getTask(){return "Порахувати площу паралелограма.";}
}
class CalcArbitraryQuadrilateral extends AreaCalculator {
    private final Scanner scanner;
    public CalcArbitraryQuadrilateral(Scanner scanner){this.scanner = scanner;}

    @Override
    protected void calcSomething() {
        System.out.println("Введіть першу діагональ: ");
        double diagonal_1 = scanner.nextDouble() + '\n';
        System.out.println("Введіть другу діагональ: ");
        double diagonal_2 = scanner.nextDouble() + '\n';
        System.out.println("Введіть кут точки перетину діагоналей: ");
        int angle = scanner.nextInt() + '\n';
        double area = 0.5 * diagonal_1 * diagonal_2 * Math.sin(angle);
        System.out.println("Площа довільного чотирикутника: " + area + "см^2");
    }
    @Override
    protected String getTask(){return "Порахувати площу довільного чотирикутника.";}
}
class CalcNGon extends AreaCalculator {
    //Площа n-кутника, де n якесь число, яке більше нуля.
    private final Scanner scanner;
    public CalcNGon(Scanner scanner){this.scanner = scanner;}

    @Override
    protected void calcSomething(){
        System.out.println("Введіть кількість сторін фігури: ");
        int n = scanner.nextInt() + '\n';
        System.out.println("Враховуйте, що сторони мають бути рівними.");
        System.out.println("Введіть сторону: ");
        double side = scanner.nextDouble() + '\n';
        double area = (n*Math.pow(side, 2)/(4*Math.tan(180/n)));
        System.out.println("Площа n-кутника: " + area + "см^2");
    }
    @Override
    protected String getTask(){return "Порахувати площу n-кутника.";}
}
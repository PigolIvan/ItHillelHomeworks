package Homework15;

import java.util.Scanner;

public class AreaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator[] areaCalculators = new AreaCalculator[]{
                new CalcCircle(scanner),
                new CalcRectangle(scanner),
                new CalcSquare(scanner),
                new CalcTriangle(scanner),
                new CalcRightTriangle(scanner),
                new CalcDullTriangle(scanner),
                new CalcVersatileTriangle(scanner),
                new CalcParallelogram(scanner),
                new CalcArbitraryQuadrilateral(scanner),
                new CalcNGon(scanner)
        };

        for (int i = 0; i < areaCalculators.length; i++) {
            System.out.println(i + 1 + " " + areaCalculators[i].getTask());
        }

        System.out.println("Виберіть пункт меню");
        int choice = scanner.nextInt() - 1;

        if (choice >= 0 && choice < areaCalculators.length) {
            areaCalculators[choice].calcSomething();
        } else {
            System.out.println("Ви вибрали невірний пункт меню");
        }
        System.out.println("Ви хочете вибрати інший спосіб в меню?(True/False)");
        boolean yeaOrNay = scanner.nextBoolean();
        if (Boolean.TRUE.equals(yeaOrNay)) {
            System.out.println("Виберіть пункт меню");
            choice = scanner.nextInt() - 1;

            if (choice >= 0 && choice < areaCalculators.length) {
                areaCalculators[choice].calcSomething();
            }
        }
    }
}
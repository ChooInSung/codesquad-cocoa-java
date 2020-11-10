package mission01;

import java.util.Scanner;

public class Star15 {
    static Scanner scanner = new Scanner(System.in);
    int count;

    public static void main(String[] args) {
        Star15 star = new Star15();
        star.printAllStars();
    }

    public void printAllStars() {
        this.count = scanner.nextInt();
        scanner.close();

        printBlanks(count - 1);
        printStars(1);
        System.out.println();

        for (int i = 0; i < count - 1; i++) {
            printBlanks(2 - i);
            printStars(1);
            printBlanks(2 * i + 1);
            printStars(1);
            System.out.println();
        }
    }

    public void printBlanks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

}

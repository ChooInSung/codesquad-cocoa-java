package mission01;

import java.util.Scanner;

public class Star17 {
    static Scanner scanner = new Scanner(System.in);
    int count;

    public static void main(String[] args) {
        Star17 star = new Star17();
        star.printAllStars();
    }

    public void printAllStars() {
        this.count = scanner.nextInt();
        scanner.close();

        printBlanks(count - 1);
        printStars(1);
        System.out.println();
        for (int i = 0; i < count - 2; i++) {
            printBlanks(count - 2 - i);
            printStars(1);
            printBlanks(2 * i + 1);
            printStars(1);
            System.out.println();
        }
        printStars(2 * count + 1);
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

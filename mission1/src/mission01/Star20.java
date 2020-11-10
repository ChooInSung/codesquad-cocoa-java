package mission01;

import java.util.Scanner;

public class Star20 {
    static Scanner scanner = new Scanner(System.in);
    int count;

    public static void main(String[] args) {
        Star20 star = new Star20();
        star.printAllStars();
    }

    public void printAllStars() {
        this.count = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < this.count; i++) {
            if (i % 2 == 0) {
                printStarAndBlank(count);
            }

            if (i % 2 != 0) {
                printBlankAndStar(count);
            }
            System.out.println();
        }
    }

    public void printStarAndBlank(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
    }

    public void printBlankAndStar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
            System.out.print("*");
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

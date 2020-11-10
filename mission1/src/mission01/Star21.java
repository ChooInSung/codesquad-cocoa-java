package mission01;

import java.util.Scanner;

public class Star21 {
    static Scanner scanner = new Scanner(System.in);
    int count;

    public static void main(String[] args) {
        Star21 star = new Star21();
        star.printAllStars();
    }

    public void printAllStars() {
        this.count = scanner.nextInt();
        scanner.close();

        if (count % 2 == 0) {
            for (int i = 0; i < count; i++) {
                printStarAndBlank(count);
                printBlankAndStar(count);
            }
        }

        if (count % 2 != 0) {
            for (int i = 0; i < count; i++) {
                printStarAndBlank(count);
                printBlankAndStar(count - 1);
            }
        }
    }

    public void printStarAndBlank(int count) {
        for (int i = 0; i < count / 2; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
    }

    public void printBlankAndStar(int count) {
        for (int i = 0; i < count / 2; i++) {
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
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

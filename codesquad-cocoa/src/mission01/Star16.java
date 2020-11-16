package mission01;

import java.util.Scanner;

public class Star16 {
    static Scanner scanner = new Scanner(System.in);
    int count;

    public static void main(String[] args) {
        Star16 star = new Star16();
        star.printAllStars();
    }

    public void printAllStars() {
        this.count = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < count; i++) {
            printBlanks(count - i - 1);
            printStarAndBlank(i + 1);
            System.out.println();
        }
    }

    public void printStarAndBlank(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
            System.out.print(" ");
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

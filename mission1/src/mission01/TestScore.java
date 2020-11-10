package mission01;

import java.util.Scanner;

public class TestScore {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int score = scanner.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.print("A");
        }

        if (score <= 89 && score >= 80) {
            System.out.print("B");
        }

        if (score <= 79 && score >= 70) {
            System.out.print("C");
        }

        if (score <= 69 && score >= 60) {
            System.out.print("D");
        }

        if (score <= 59 && score >= 0) {
            System.out.print("F");
        }
    }

}

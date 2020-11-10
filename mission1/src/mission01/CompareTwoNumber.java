package mission01;

import java.util.Scanner;

public class CompareTwoNumber {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number1<number2) {
            System.out.print("<");
        }

        if(number1>number2) {
            System.out.print(">");
        }

        if(number1==number2) {
            System.out.print("==");
        }
    }
}

package mission01;

import java.util.Scanner;

public class Gugudan {
    static Scanner scanner = new Scanner(System.in);
    int start;
    int end;

    public static void main(String[] args) {

        Gugudan gugudan = new Gugudan();
        gugudan.getGugudanInput();
        gugudan.printAllGugudan();
    }

    public void getGugudanInput() {
        this.start = scanner.nextInt();
        this.end = scanner.nextInt();
    }

    public void printAllGugudan() {
        for (int i = start; i <= end; i++) {
            printGugudan(i);
        }
    }

    public void printGugudan(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.print(num + " * " + i + " = " + num * i + "\t");
        }
        System.out.println();
    }


}

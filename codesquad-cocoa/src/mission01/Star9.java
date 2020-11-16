package mission01;

public class Star9 {

    public static void main(String[] args) {
        Star9 star = new Star9();
        star.printAllStars();
    }

    public void printAllStars() {
        printUpperStars();
        printUnderStars();
    }

    public void printUpperStars() {
        for (int i = 0; i < 5; i++) {
            printBlanks(i);
            printStars(9 - 2 * i);
            printBlanks(i);
            System.out.println();
        }
    }

    public void printUnderStars() {
        for (int i = 0; i < 4; i++) {
            printBlanks(3 - i);
            printStars(2 * i + 3);
            printBlanks(3 - i);
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

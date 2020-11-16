package mission01;

public class Star8 {

    public static void main(String[] args) {
        Star8 star = new Star8();
        star.printAllStars();
    }

    public void printAllStars() {
        printUpperStars();
        printUnderStars();
    }

    public void printUpperStars() {
        for (int i = 0; i < 5; i++) {
            printStars(i + 1);
            printBlanks(8 - 2 * i);
            printStars(i + 1);
            System.out.println();
        }
    }

    public void printUnderStars() {
        for (int i = 0; i < 4; i++) {
            printStars(4 - i);
            printBlanks(2 * i + 2);
            printStars(4 - i);
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

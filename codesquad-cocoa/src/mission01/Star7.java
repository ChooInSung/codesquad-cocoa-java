package mission01;

public class Star7 {

    public static void main(String[] args) {
        Star7 star = new Star7();
        star.printAllStars();
    }

    public void printAllStars() {

        for (int i = 0; i < 4; i++) {
            printBlanks(4 - i);
            printStars(2 * i + 1);
            System.out.println();
        }

        for (int i = 4; i >= 0; i--) {
            printBlanks(4 - i);
            printStars(2 * i + 1);
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

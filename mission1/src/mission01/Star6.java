package mission01;

public class Star6 {

    public static void main(String[] args) {
        Star6 star = new Star6();
        star.printAllStars();
    }

    public void printAllStars() {
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

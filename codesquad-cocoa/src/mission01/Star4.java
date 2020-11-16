package mission01;

public class Star4 {

    public static void main(String[] args) {
        Star4 star = new Star4();
        star.printAllStars();
    }

    public void printAllStars() {
        for (int i = 0; i < 5; i++) {
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

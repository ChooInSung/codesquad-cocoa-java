package mission01;

public class Star1 {

    public static void main(String[] args) {
        Star1 star = new Star1();
        star.printStarIncreasing();
    }

    public void printStarIncreasing() {
        for (int i = 1; i <= 5; i++) {
            printStarByCount(i);
        }
    }

    public void printStarByCount(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

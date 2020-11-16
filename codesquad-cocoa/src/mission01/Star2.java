package mission01;

public class Star2 {

    public static void main(String[] args) {
        Star2 star = new Star2();
        star.printStarIncreasing();
    }

    public void printStarIncreasing() {
        for (int i = 1; i <= 5; i++) {
            printBlank(5 - i);
            printStarByCount(i);
        }
    }

    public void printStarByCount(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printBlank(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

}

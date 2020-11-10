package mission01;

public class Star3 {

    public static void main(String[] args) {
        Star3 star = new Star3();
        star.printStarDecreasing();
    }

    public void printStarDecreasing() {
        for (int i = 0; i < 5; i++) {
            printStarByCount(5 - i);
        }
    }

    public void printStarByCount(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}

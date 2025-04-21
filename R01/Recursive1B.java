package R01;

public class Recursive1B {
    public static void printTriangle(int n) {
        printTriangleHelper(1, n);
    }

    private static void printTriangleHelper(int current, int max) {
        if (current > max) return;  

        for (int i = 0; i < current; i++) {
            System.out.print("*");
        }
        System.out.println();

        printTriangleHelper(current + 1, max);
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}

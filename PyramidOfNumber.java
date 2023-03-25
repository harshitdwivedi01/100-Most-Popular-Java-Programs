public class PyramidOfNumber {
    public static void main(String[] args) {
        // create a pyramid of numbers in java

        //   1
        //  1 1
        // 1 1 1
        int n = 3;
        int rows = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
            rows++;
        }
    }
}

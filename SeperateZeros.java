public class SeperateZeros {
    public static void main(String[] args) {

        // java program to separate zeros from non-zeros in the given array.

        // if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving zeros to end of the
        // array will result {14, 5, 2, 3, 0, 0, 0} and bringing zeros to front will
        // result {0, 0, 0, 14, 5, 2, 3}.

        int[] arr = { 14, 0, 5, 2, 0, 3, 0 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

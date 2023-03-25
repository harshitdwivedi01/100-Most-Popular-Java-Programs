public class ContigousArraySum {
    public static void main(String[] args) {
        // If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number,
        // then you have to find continuous sub array in this array such that whose
        // elements add up to 45.
        // In this case, {5, 31, 9} is such sub array whose elements add up to 45.
        int[] arr = { 12, 5, 31, 9, 21, 8 };
        int k = 45;
        int sum = arr[0];
        int start = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            while (sum > k && start <= i - 1) {
                sum -= arr[start];
                start++;
            }
            if (sum == k) {
                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}

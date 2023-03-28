public class ReverseAndPalindrome {
    public static void main(String[] args) {
        // Take number from the user, reverse it and add it to itself.
        // If the sum is not a palindrome then repeat the procedure until you get a
        // palindrome.

        int number = 7325;
        int count = 0;
        // isPalind
        // doReverse
        while (!isPalind(number)) {
            int res = doReverse(number);
            number += res;
            count++;
        }
        System.out.println(number);
    }

    static int doReverse(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }
        return sum;
    }

    static boolean isPalind(int num) {
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }
        return temp == sum ? true : false;
    }
}

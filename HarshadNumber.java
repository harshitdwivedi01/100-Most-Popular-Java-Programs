public class HarshadNumber {
    public static void main(String[] args) {
        // Harshad number or niven number is a number which is divisible by the sum of
        // its digits. For ex- 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, 45, 48, 50,
        // 54...
        // For example, 21 is a Harshad number because 21 is divisible by the sum of its
        // digits (2+1=3).
        int number = 54;
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        if (number % sum == 0)
            System.out.println("Yes it is Harshad Number");
        else
            System.out.println("No, it is not a Harshad Number");
    }
}

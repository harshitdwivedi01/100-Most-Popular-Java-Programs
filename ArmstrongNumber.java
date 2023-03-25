public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 9474;
        // check whether the number is armstrong number or not.
        int sum = 0;
        int count = 0;
        int temp = number;
        while (temp != 0) {
            int rem = temp % 10;
            count++;
            temp /= 10;
        }
        temp = number;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        if (sum == number)
            System.out.println("Yes it is armstrong number");
        else
            System.out.println("No, it is not armstrong...");
    }
}

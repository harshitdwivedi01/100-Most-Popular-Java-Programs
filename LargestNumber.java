public class LargestNumber {
    public static void main(String[] args) {
        // For example, If 145 is the given number and 4 is the given digit,
        // then you should find the largest number less than 145 such that it should not
        // contain 4 in it.
        // In this case, 139 will be the answer.
        int num = 145;
        int k = 4;
        boolean flag = true;
        while (num-- > 0) {
            int temp = num;
            flag = true;
            while (temp != 0) {
                int rem = temp % 10;
                if (rem == k) {
                    flag = false;
                    break;
                }
                temp /= 10;
            }
            if (flag) {
                System.out.println(num);
                return;
            }
        }

    }
}

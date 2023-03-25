public class CheckBinary {
    public static void main(String[] args) {
        int number = 1123;
        int temp = number;
        boolean flag = true;
        while (number != 0) {
            int rem = number % 10;
            if (rem != 1 && rem != 0) {
                flag = false;
                break;
            }
            number /= 10;
        }

        if (flag) {
            System.out.println(temp + " is binary number");
        } else {
            System.out.println(temp + " is not a binary number");
        }
    }
}

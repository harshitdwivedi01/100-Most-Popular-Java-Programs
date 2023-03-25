public class CheckEquility {
    public static void main(String[] args) {
        // check the equality of two arrays in java

        int[] firstarray = { 2, 7, 1, 5, 3 };
        int[] secondarray = { 2, 7, 1, 5, 3 };
        boolean flag = checkArrays(firstarray, secondarray);
        System.out.println("Both the Arrays are equal: " + flag);

    }

    static boolean checkArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}

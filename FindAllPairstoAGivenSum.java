import java.util.HashSet;

public class FindAllPairstoAGivenSum {
    public static void main(String[] args) {
        // if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
        // then you have to find all pairs of elements in this array whose sum must be
        // 20.
        // In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
        int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };
        int GivenSum = 20;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        for (int i = 0; i < arr.length; i++) {
            int diff = GivenSum - arr[i];
            if (set.contains(diff)) {
                System.out.println("(" + arr[i] + "," + diff + ")");
                set.remove(arr[i]);
            }
        }
    }
}

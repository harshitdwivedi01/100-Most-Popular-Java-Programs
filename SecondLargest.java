import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 7, 1 };
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++)
            que.add(arr[i]);
        que.remove();
        System.out.println(que.peek());
    }
}
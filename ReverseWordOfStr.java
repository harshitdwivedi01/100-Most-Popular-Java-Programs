import java.util.*;

public class ReverseWordOfStr {
    public static void main(String[] args) {
        String str = "John Doe";
        // Output: nhoJ eoD
        String temp = "";
        String[] strs = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            for (int j = strs[i].length() - 1; j >= 0; j--) {
                temp = temp + strs[i].charAt(j);
            }
            list.add(temp);
            temp = "";
            list.add(" ");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}

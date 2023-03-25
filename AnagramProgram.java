import java.util.HashSet;

public class AnagramProgram {
    public static void main(String[] args) {
        String first = "Mother In Law";
        String second = "Hitler Women";
        String firststr = first.toLowerCase().replaceAll(" ", "");
        String secondstr = second.toLowerCase().replaceAll(" ", "");
        boolean ans = checkAnagram(firststr, secondstr);
        System.out.println("Both are anagram: " + ans);

    }

    static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            set.add(t.charAt(i));
        }
        return set.size() == s.length() ? true : false;
    }
}

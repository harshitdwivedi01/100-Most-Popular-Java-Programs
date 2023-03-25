public class ReverseString {
    public static void main(String[] args) {
        String str = "abc"; // print reverse of string 'cba' using recursive method
        String res = reverse(str);
        System.out.println(res);
    }

    public static String reverse(String s) {
        if (s.length() <= 1 || s == null)
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
public class substring {
    public static boolean Present(String s, String t) {
        int slen = 0;
        int tlen = 0;
        while (tlen < t.length() && slen < s.length()) {
            if (t.charAt(tlen) == s.charAt(slen)) {
                slen++;
            }
            tlen++;
        }
        if (slen == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "abbxsc";
        String t = "abbhxc";
        System.out.println(Present(s, t));

    }
}

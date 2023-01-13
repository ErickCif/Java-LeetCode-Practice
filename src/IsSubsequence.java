public class IsSubsequence {
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
    of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a
    subsequence of "abcde" while "aec" is not).
     */

    public static void main(String[] args){
        /*
        Input: s = "abc", t = "ahbgdc"
        Output: true
         */
        String s = "abc";
        String t = "ahbgdc";
        boolean output = isSub(s, t);
        System.out.println(output);
    }

    public static boolean isSub(String s, String t){
        return (subRec(s, t, s.length(), t.length()));
    }

    public static boolean subRec(String s, String t, int x, int y){
        if(x == 0){
            return true;
        }
        if(y == 0){
            return false;
        }

        if(s.charAt(x-1) == t.charAt(y-1)){
            return subRec(s, t, x-1, y-1);
        }

        return subRec(s, t, x, y-1);
    }
}

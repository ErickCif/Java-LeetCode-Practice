public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
     */
    public static void main(String[] args){
        /*
        Input: s = "anagram", t = "nagaram"
        Output: true
         */
        String s = "anagram";
        String t = "nagaram";

        boolean output = isAnag(s, t);
        System.out.println(output);
    }
    public static boolean isAnag(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] lettersArray = new int[26];

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            int index = temp - 'a';
            lettersArray[index]++;
        }

        for(int i = 0; i < t.length(); i++){
            char temp = t.charAt(i);
            int index = temp - 'a';
            lettersArray[index]--;
        }

        for(int i: lettersArray){
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}

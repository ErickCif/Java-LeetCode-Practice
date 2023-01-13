import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    /*
    Given two strings s and t, determine if they are isomorphic.

    Two strings s and t are isomorphic if the characters in s can be replaced to get t.

    All occurrences of a character must be replaced with another character while preserving the order of characters.
    No two characters may map to the same character, but a character may map to itself.
    */
    public static void main(String[] args){
        /*
        Input: s = "egg", t = "add"
        Output: true
        */
        String inputS = "egg";
        String inputT = "add";

        boolean output = isIso(inputS, inputT);
        System.out.println(output);
    }
    public static boolean isIso(String s, String t){
        Map map = new HashMap();
        for(int i = 0; i<s.length(); ++i){
            if(map.put(s.charAt(i), i) != map.put(t.charAt(i) +"", i)){
                return false;
            }
        }
        return true;
    }
}

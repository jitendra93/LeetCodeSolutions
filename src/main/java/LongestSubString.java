import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {
    //Leet code 3 https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {

        int[] charMap = new int[256] ;
        Arrays.fill(charMap, -1);
        int low = 0;
        int max = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if(charMap[c] != -1){
                max = Math.max(max, i - low);
                low = charMap[c] + 1;
                Arrays.fill(charMap,-1);
                i = low-1;
            }else{
                charMap[c] = i;
            }
        }
        max = Math.max(max, i - low);
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubString().lengthOfLongestSubstring("abcabcbb"));
    }
}

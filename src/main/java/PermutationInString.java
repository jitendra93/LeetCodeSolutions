import java.util.Arrays;

public class PermutationInString {

//https://leetcode.com/problems/permutation-in-string/ #567
    public static void main(String[] args) {
        boolean res = checkInclusion("adc", "dcda");
        System.out.println(res);
    }

    public static boolean checkInclusion(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        int code = Arrays.hashCode(s1Arr);
        int window = s1.length();
        int i = 0;
        while (i <= s2.length() - window){
            String tempStr = s2.substring(i,i+window);
            char[] temp = tempStr.toCharArray();
            Arrays.sort(temp);
            int tempHash = Arrays.hashCode(temp);
            if(tempHash == code){
                return true;
            }
            i++;
        }
        return false;
    }
}

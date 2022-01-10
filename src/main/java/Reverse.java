public class Reverse {
    static class Solution {
        public String reverseWords(String s) {

            char[] charArr = s.toCharArray();

            int low = 0;
            int high = 0;
            char c ;
            while(high<= charArr.length){

                if(high == charArr.length || charArr[high]== ' ' ){
                    reverseString(charArr,low,high-1);
                    low = high+1;
                }
                high++;
            }
            return String.valueOf(charArr);
        }

        public void reverseString(char[] s, int low, int high) {

            while(low < high){
                char temp = s[low];
                s[low] = s[high];
                s[high] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        String s = new Solution().reverseWords("Let's take LeetCode contest");
        System.out.println(s);

    }
}

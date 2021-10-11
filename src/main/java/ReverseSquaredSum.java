
import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/reverse-squared-sum/0/
class ReverseSquaredSum {
    public static void main (String[] args) {
        //code

        FastReader fastReader = new FastReader();
        int cases = fastReader.nextInt();
        for (int i = 0; i < cases; i++) {
            int n = fastReader.nextInt();
            String[] arr = new String[n];
            arr = fastReader.nextLine().split(" ");
            int result = 0;
            boolean shouldAdd = true;
            for (int j = arr.length-1; j >=0; j--) {
                int val = Integer.parseInt(arr[j]);
                result = result + (val * val *( shouldAdd ? 1 : -1));
                shouldAdd = ! shouldAdd;
            }                System.out.println(result);


        }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
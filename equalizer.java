/*
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3
*/

import java.util.StringTokenizer;
import java.io.*;
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
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
}
public class eq {
    public static void main(String[] args) {
        FastReader a = new FastReader();
        int T = a.nextInt();
        for (int m = 0; m < T; m++) {
            int N = a.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = a.nextInt();
            }
            boolean st=false;
            int sum = 0;
            int leftsum = 0;
            for (int i = 0; i < N; i++) {
                sum = sum + arr[i];
            }
            for (int i = 0; i < N; i++) {
                sum = sum - arr[i];
                if (leftsum == sum) {
                    System.out.println(i + 1);
                    st=true;
                    break;
                }
                leftsum = leftsum + arr[i];
            }
            if(st==false){
                System.out.println(-1);
            }
        }
    }
}

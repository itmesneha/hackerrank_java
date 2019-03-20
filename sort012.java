/*
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints: 
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1
*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class sort012
{
  public static void main(String args[]) throws Exception
  {
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int n,j,i,t;
    t = sc.nextInt();
    for(j=0;j<t;j++)
    {
      n = sc.nextInt();
      //n = Integer.parseInt(br.readLine());
      int a[] = new int[n];
      int b[] = new int[3];
      StringBuffer sb = new StringBuffer();
      for(i=0;i<n;i++)
      {
        a[i] = sc.nextInt();
        //a[i] = br.read();
      }
      for(i=0;i<n;i++)
      {
        if(a[i] == 0)
          b[0] += 1;
        if(a[i] == 1)
          b[1] += 1;
        if(a[i] == 2)
          b[2] += 1;
      }
      for(i=1;i<=b[0];i++)
        sb.append("0 ");
        //System.out.print("0 ");
      for(i=1;i<=b[1];i++)
        sb.append("1 ");
        //System.out.print("1 ");
      for(i=1;i<=b[2];i++)
        sb.append("2 ");
        //System.out.print("2 ");
      System.out.println(sb);
      //System.out.println("");
    }
  }
}

/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5
*/
import java.io.*;
import java.util.Scanner;

public class code
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int l,k,t,n,s,sum,i,j;
    t = sc.nextInt();
    for(k=0;k<t;k++)
    {
      n = sc.nextInt();
      s = sc.nextInt();
      int a[] = new int[n];
      for(l=0;l<n;l++)
      {
        a[l] = sc.nextInt();
      }
      bla(a,n,s);
    }
  }

    public static int bla(int a[],int n,int s)
    {
      int j,sum,i;
      for(j=0;j<n;j++)
      {
        sum = 0;
        for(i=j;i<n;i++)
        {
          sum = sum + a[i];
          if(sum == s)
          {
              System.out.println((j+1)+" "+(i+1));
              return 0;
          }
          if(sum>s)
           break;

        }
      }
      System.out.println("-1");
      return 0;
    }
}

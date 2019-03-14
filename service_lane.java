import java.io.*;
import java.util.Scanner;
import java.math.*;

public class service_lane
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int i,j,min;
    int a[] = new int[n];
    for(int k=0;k<n;k++)
    {
      a[k] = sc.nextInt();
    }
    for(int l=0;l<t;l++)
    {
      min = 9999;
      i = sc.nextInt();
      j = sc.nextInt();
      for(int w=i;w<=j;w++)
      {
        if(a[w]<min)
          min = a[w];
      }
      System.out.println(min);
    }
  }
}

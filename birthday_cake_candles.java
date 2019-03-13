import java.io.*;
import java.util.Scanner;
import java.math.*;

public class birthday_cake_candles{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int max = a[0] = sc.nextInt();
    for(int i=1;i<n;i++)
    {
      a[i] = sc.nextInt();
      if(a[i]>max)
        max = a[i];
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(a[i] == max)
        count++;
    }
    System.out.print(count);
    sc.close();
  }
}

import java.io.*;
import java.util.Scanner;
import java.math.*;

public class chocolate_feast
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    long n,c,m;
    for(int i=0;i<t;i++)
    {
      n = sc.nextLong();
      c = sc.nextLong();
      m = sc.nextLong();
      long x = 0;
      long w = 0; //x = chocolates w = wrappers
      x = n/c;
      w = n/c;
      do
      {
        x += w/m;
        w = w/m + w%m;
      } while (w >= m);
      System.out.println(x);
    }
  }
}

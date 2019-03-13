import java.io.*;
import java.util.Scanner;
import java.math.*;

public class staircase{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=n-i;j>0;j--)
      {
        System.out.printf(" ");
      }
      for(int k=1;k<=i;k++)
      {
        System.out.printf("#");
      }
      System.out.println("");
    }
    sc.close();
  }
}

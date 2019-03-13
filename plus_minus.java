import java.io.*;
import java.util.Scanner;
import java.math.*;

public class plus_minus{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    float positive=0,negative=0,zero=0;
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
      if(a[i]>0)
        positive += 1;
      if(a[i]<0)
        negative += 1;
      if(a[i] == 0)
        zero += 1;
    }
    positive = positive/n;
    negative = negative/n;
    zero = zero/n;
    System.out.printf("%6f\n",positive);
    System.out.printf("%6f\n",negative);
    System.out.printf("%6f\n",zero);
    sc.close();
  }
}

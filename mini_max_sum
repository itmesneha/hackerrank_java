import java.io.*;
import java.util.Scanner;
import java.math.*;

public class mini_max_sum{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    long a[] = new long[5];
    long max,min,sum,min_sum,max_sum;
    max = min = sum = max_sum = min_sum = 0;
    a[0] = sc.nextLong();
    max = min = sum = a[0];
    for(int i=1;i<5;i++)
    {
      a[i] = sc.nextLong();
      sum += a[i];
      if(a[i]>max)
        max = a[i];
      if(a[i]<min)
        min = a[i];
    }
    //System.out.println(max);
    //System.out.println(min);
    max_sum = sum - min;
    min_sum = sum - max;
    System.out.print(min_sum+" "+max_sum);
    sc.close();
  }
}

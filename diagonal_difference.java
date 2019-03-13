import java.io.*;
import java.util.Scanner;

public class diagonal_difference{

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    int i,j,leftsum=0,rightsum=0;
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();

    //left to right diagonal
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        if(i==j)
          leftsum += a[i][j];
      }
    }
    //System.out.println("left"+leftsum);
    //right to left diagonal
    for(i=n-1,j=0;i>=0 && j<n;i--,j++)
    {
      rightsum += a[i][j];
    }
    //System.out.println("right"+rightsum);

    int result;
    if(leftsum>rightsum)
      result = leftsum - rightsum;
    else
      result = rightsum - leftsum;

    System.out.println(result);

    sc.close();
  }
}

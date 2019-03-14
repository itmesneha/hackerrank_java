import java.io.*;
import java.util.Scanner;
import java.math.*;

public class time_conversion{

  public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String time = scan.next();
        String tArr[] = time.split(":");
        //System.out.print(tArr[0]+"\n");
        //System.out.print(tArr[1]+"\n");
        //System.out.print(tArr[2]+"\n");
        String AmPm = tArr[2].substring(2,4);
        //System.out.print(AmPm+"\n");
        int hh,mm,ss;
        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0,2));

        String checkPM = "PM",checkAM ="AM";
        int h = hh;
        if(AmPm.equals(checkAM) && hh==12)
        	h=0;
        else if(AmPm.equals(checkPM)&& hh<12)
        	h+=12;

        System.out.printf("%02d:%02d:%02d",h,mm,ss);
    }
}

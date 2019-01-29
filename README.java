import java.io.*;
import java.util.*;
public class Median 
{

    public static void main(String[] args)
     {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int a = input.nextInt();
       int[] num = new int[a];
       for (int i = 0; i < a; i++)
          {
              System.out.print("");
              num[i] = input.nextInt();
          }
       System.out.println();
      {
       int j,k,sum=0;
       for(j=0;j<a;j++)
       		{
        	   sum=sum+num[j];
    		}
    		Median=sum/a;
       System.out.println(Median);
      }
}
}

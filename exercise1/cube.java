//write a program in java to display the cube of number up to a given integer
import java.util.Scanner;
public class cube {

    
  public static void main(String[] args)
    {
     int i,n;
         System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
     for(i=1;i<=n;i++)
{

   System.out.println("number is:"+i+"and cube of "+i+" is : "+(i*i*i));
}
}
}



/*
output

Enter the number:
5
number is:1and cube of 1 is : 1
number is:2and cube of 2 is : 8
number is:3and cube of 3 is : 27
number is:4and cube of 4 is : 64
number is:5and cube of 5 is : 125
*/

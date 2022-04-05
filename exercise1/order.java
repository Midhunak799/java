//write a program that accepts three numbers form the user and prints increasing and decreasing order
import java.util.Scanner;
public class order {

    
  public static void main(String[] args)

{
      Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:"); 
        double x=in.nextDouble();                          //  using for storing large numbers          


         System.out.println("Enter the second number:");
         double y=in.nextDouble();


        System.out.println("Enter the third number:");
         double z=in.nextDouble();


      if(x<y&&y<z)

   {

     System.out.println("increasing order");         //declaring the numbers are in increasing order
    } 
     
     else if(x>y&&y>z)
   {

    System.out.println("dicreasing order");      //declaring the numbers are in decreasing order 
    }

   else
  {

    System.out.println("neigther increasing or dicreasing order");
    }
}
}




/*
output

Enter the first number:
4
Enter the second number:
6
Enter the third number:
8
increasing order



Enter the first number:
100
Enter the second number:
50
Enter the third number:
25
dicreasing order



Enter the first number:
1117
Enter the second number:
27276
Enter the third number:
1551
neigther increasing or dicreasing order
*/


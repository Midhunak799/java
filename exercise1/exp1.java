//write a java program to read floating point number  if the number is zero it print zero otherwise print positive or negative
import java.util.Scanner;
public class exp1 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);      //  for reading values
        System.out.print("Input value: ");
        double input = in.nextDouble();            //storing large no of values

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}





/*
 output


Input value: 25
Positive number

Input value: -12
Negative number

Input value: 34567
Positive number
*/


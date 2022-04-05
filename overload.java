/*
Find the area of different shapes using overloaded
functions
*/
import java.util.*;
class OverLoadArea{

		void area(int a){                                      // term for area of squre
			System.out.println("Area of Squre:"+a*a);	
		}
		void area(int a,int b){	                               //term for area of Rectangle
			System.out.println("Area of Rectangle:"+a*b);	
		}
		void area(double r){	                                //term  for area of Circle
			System.out.println("Area of Circle:"+3.14*r*r);	
		}
	}
			
class overload{
	public static void main(String ar[]){	
	
			Scanner sc=new Scanner(System.in); //scanner object
			OverLoadArea oa=new OverLoadArea();	//object of class OverLoadArea
			
			System.out.println("1.SQUARE\n2.RECTANGLE\n3.CIRCLE");
			System.out.print("ENTER YOUR OPTION:");
			int opt = sc.nextInt();
			
			switch(opt){
				case 1:System.out.println("SQUARE");
					   System.out.print("ENTER THE SIDE OF SQUARE:");
					   int side = sc.nextInt();
					   oa.area(side);
					   break;
				case 2:System.out.println("RECTANGLE");
					   System.out.print("ENTER LENGTH OF RECTANGLE:");
					   int len = sc.nextInt();
					   System.out.print("ENTER THE BREADTH OF RECTANGLE:");
					   int brd = sc.nextInt();
					   oa.area(len,brd);
					   break;
				case 3:System.out.println("CIRCLE");
					   System.out.print("ENTER THE RADIOUS OF CIRCLE:");
					   double r = sc.nextDouble();
					   oa.area(r);
					   break;
					   
			
			
			
			}
			
			
	}


}
/*


1.SQUARE
2.RECTANGLE
3.CIRCLE
ENTER YOUR OPTION:1
SQUARE
ENTER THE SIDE OF SQUARE:10
Area of Squre:100

1.SQUARE
2.RECTANGLE
3.CIRCLE
ENTER YOUR OPTION:2
RECTANGLE
ENTER LENGTH OF RECTANGLE:5
ENTER THE BREADTH OF RECTANGLE:10
Area of Rectangle:50


1.SQUARE
2.RECTANGLE
3.CIRCLE
ENTER YOUR OPTION:3
CIRCLE
ENTER THE RADIOUS OF CIRCLE:6
Area of Circle:113.03999999999999
*/
//Verified

import java.util.*;
class OverLoadArea{

		void area(int a){    //methord for area of squre
			System.out.println("AREA OF SQUARE:"+a*a);	
		}
		void area(int a,int b){	//methord for area of Rectangle
			System.out.println("AREA OF RECTANGLE:"+a*b);	
		}
		void area(double r){	//methord for area of Circle
			System.out.println("AREA OF CIRCLE:"+3.14*r*r);	
		}
	}
			
class overload{
	public static void main(String arg[]){	//main methord
	
			Scanner sc=new Scanner(System.in); //scanner object
			OverLoadArea o=new OverLoadArea();	//object of class OverLoadArea
			
			System.out.println("1.SQUARE\n2.RECTANGLE\n3.CIRCLE");
			System.out.print("ENTER YOUR OPTION:");
			int opt = sc.nextInt();
			
			
			switch(opt){
				case 1:System.out.println("SQUARE");                        //case of square
					   System.out.print("ENTER THE SIDE OF SQUARE:");
					   int side = sc.nextInt();
					   o.area(side);
					   break;
				case 2:System.out.println("RECTANGLE");                       //case of rectangle
					   System.out.print("ENTER THE LENGTH OF RECTANGLE:");
					   int len = sc.nextInt();
					   System.out.print("ENTER THE BREADTH OF RECTANGLE:");
					   int brd = sc.nextInt();
					   o.area(len,brd);
					   break;
				case 3:System.out.println("CIRCLE");                            //case of circle
					   System.out.print("ENTER THE RADIOUS OF CIRCLE:");
					   double r = sc.nextDouble();
					   o.area(r);
					   break;
					   
			
			
			
			}
			
			
	}


}
/*
output


1.SQUARE
2.RECTANGLE
3.CIRCLE
ENTER YOUR OPTION:1
SQUARE
ENTER THE SIDE OF SQUARE:10
AREA OF SQUARE:100

1.SQUARE
2.RECTANGLE
3.CIRCLE
ENTER YOUR OPTION:2
RECTANGLE
ENTER THE LENGTH OF RECTANGLE:5
ENTER THE BREADTH OF RECTANGLE:10
AREA OF RECTANGLE:50

1.SQUARE
2.RECTANGLE
3.CIRCLE
ENTER YOUR OPTION:3
CIRCLE
ENTER THE RADIOUS OF CIRCLE:6
AREA OF CIRCLE:113.03999999999999


*/


/*Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects.*/


import java.util.*;

interface AP{
	void input();
	void area();
	void perimeter();
}
class Circle implements AP{
	Scanner sc=new Scanner(System.in);
	int r=0;
	double pi=3.14;
	double area=0;
	double perimeter=0;
	public void input(){
		System.out.print("ENTER RADIOUS OF THE CIRCLE:");
		this.r=sc.nextInt();	
	
	}
	
	public void area(){
		area=pi*r*r;
		System.out.println("AREA OF CIRCLE IS="+area);
	
	}
	
	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("PERIMETER IS="+perimeter);
	
	}


}



class Rectangle implements AP{
	Scanner sc=new Scanner(System.in);
	int l=0;
	int b=0;
	double area=0;
	double perimeter=0;
	public void input(){
		System.out.print("ENTER THE LENGTH OF RECTANGLE:");
		this.l=sc.nextInt();
                System.out.print("ENTER THE BREADTH OF RECTANGLE:");
		this.b=sc.nextInt();
	
	}
	
	public void area(){
		area=l*b;
		System.out.println("AREA OF RECTANGLE IS="+area);
	
	}
	
	public void perimeter(){
		perimeter=2*(l+b);
		System.out.println("PERIMETER IS="+perimeter);
	
	}


}




class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Circle cir=new Circle();
		Rectangle rect= new Rectangle();
	
		while(true){
			
			System.out.println("\n1.CIRCLE\n2.RECTANGLE\n3.EXIT..");
			System.out.print("SELECT OPTION:");			
			int opt =sc.nextInt();
			switch(opt){
				case 1:System.out.println("\nCIRCLE");
					   cir.input();
					   cir.area();
					   cir.perimeter();
					 
					   break;
				case 2:System.out.println("\n\nRECTANGLE");
					   rect.input();
					   rect.area();
					   rect.perimeter();
					   
					   break;
			   default:System.out.println("EXITING...!");
			   
			   		   System.exit(0);
			   		   break;
			}
		
		
		}
	
	} 


}
/*
OUTPUT
--------------
1.CIRCLE
2.RECTANGLE
3.EXIT..
SELECT OPTION:1

CIRCLE
ENTER RADIOUS OF THE CIRCLE:6
AREA OF CIRCLE IS=113.03999999999999
PERIMETER IS=37.68

1.CIRCLE
2.RECTANGLE
3.EXIT..
SELECT OPTION:2


RECTANGLE
ENTER THE LENGTH OF RECTANGLE:10
ENTER THE BREADTH OF RECTANGLE:5
AREA OF RECTANGLE IS=50.0
PERIMETER IS=30.0

1.CIRCLE
2.RECTANGLE
3.EXIT..
SELECT OPTION:3
EXITING...!
*/

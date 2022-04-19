/*exp1. Define a class ‘product’ with data members pcode, pname and price.
Create 3 objects of the class and find the product having the lowest
price
*/
import java.util.*;

class Product{                                                         //create a class product
	int pcd;
	double price;		                                       //declare variables
	String pnm;
	void disp(){                                                  //  display details
		
		System.out.println("PRODUCT CODE:"+pcd+"\nPRODUCT NAME:"+pnm+"\nPRODUCT PRICE"+price);		
	     
	}
}

public class Details {                                                 //main class
	public static void main(String ar[]){                          //main function
		Scanner ob=new Scanner(System.in);
		Product prdt1=new Product();                           //create 3 objects of Product class
		Product prdt2=new Product();
		Product prdt3=new Product();
		
		System.out.println("\nENTER THE DETAILS OF PRODUCT 1");	//details of product
		System.out.print("\nPRODUCT CODE:");
		prdt1.pcd=ob.nextInt();
		System.out.print("\nPRODUCT NAME:");
		prdt1.pnm=ob.next();
		System.out.print("\nPRODUCT PRICE:");
		prdt1.price=ob.nextDouble();
		
		
		System.out.println("\nENTER THE DETAILS OF PRODUCT 2");	
		System.out.print("\nPRODUCT CODE:");
		prdt2.pcd=ob.nextInt();
		System.out.print("\nPRODUCT NAME:");
		prdt2.pnm=ob.next();
		System.out.print("\nPRODUCT PRICE:");
		prdt2.price=ob.nextDouble();
	
		
		
		System.out.println("\nENTER THE DETAILS OF PRODUCT 3");	
		System.out.print("\nPRODUCT CODE:");
		prdt3.pcd=ob.nextInt();
		System.out.print("\nPRODUCT NAME:");
		prdt3.pnm=ob.next();
		System.out.print("\nPRODUCT PRICE:");
		prdt3.price=ob.nextDouble();
		
		
		
		
		if(prdt1.price<prdt2.price){		                //checking for minimum priced product
	      
			if(prdt1.price<prdt3.price){
				System.out.println("\nTHE PRODUCT "+prdt1.pnm+" IS MINIMUM PRICE\n");
				prdt1.disp();
			}
			else{
				System.out.println("\nTHE PRODUCT "+prdt3.pnm+" IS MINIMUM PRICE \n");
				prdt3.disp();
			}	
		}
		else{
		 
			if(prdt2.price<prdt3.price){
				System.out.println("\nTHE PRODUCT "+prdt2.pnm+" IS MINIMUM PRICE\n");
				prdt2.disp();
			}
			else{
				System.out.println("\nTHE PRODUCT "+prdt3.pnm+" IS MINIMUM PRICE\n");
				prdt3.disp();
			}	
		}
		
		
	}
	

}

  


OUTPUT

/*

ENTER THE DETAILS OF PRODUCT 1

PRODUCT CODE:1

PRODUCT NAME:BAT

PRODUCT PRICE:5000

ENTER THE DETAILS OF PRODUCT 2

PRODUCT CODE:2

PRODUCT NAME:BALL

PRODUCT PRICE:1000

ENTER THE DETAILS OF PRODUCT 3

PRODUCT CODE:3

PRODUCT NAME:HELMET

PRODUCT PRICE:2000

THE PRODUCT BALL IS MINIMUM PRICE

PRODUCT CODE:2
PRODUCT NAME:BALL
PRODUCT PRICE1000.0


*/


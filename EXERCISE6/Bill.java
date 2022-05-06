/*Prepare bill with the given format using
calculate method from interface.*/
import java.util.* ;
interface BillGen{
	int calculate( ) ;
}
class ProductB implements BillGen {
	String name ;
	int prodid , quantity , unitprice , total ;
	ProductB ( ){}
	ProductB( String n , int p , int q , int u){
		name = n ; 
		prodid = p ;
		quantity = q ;
		unitprice = u ;
	}
	public int calculate ( ) {              //FUCTION DEFINING
		total = quantity * unitprice ;
		return total ;
	}
}
public class Bill {
	public static void main ( String [ ] args ) {
		ProductB [ ] [ ] order ;
		System.out.println (" ENTER NUMBER OF ORDERS : " ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int n = sc.nextInt ( ) ;
		order = new ProductB[n][ ] ;
		for ( int i = 0 ; i < n ; i++){
			System.out.print(" ENTER NUMBER OF PRODUCTS: " ) ;
			int m = sc.nextInt ( ) ;
			order[i] = new ProductB[m] ;
			for (int j = 0 ; j < m; j++ ){
				System.out.print (" ENTER PRODUCT " + (j+1) + " NAME : " ) ;
				String a = sc.next ( ) ;
				System.out.print(" ENTER PRODUCT ID: " ) ;
				int b = sc.nextInt ( ) ;
				System.out.print (" ENTER PRODUCT QUANTITY : " ) ;
				int c = sc . nextInt ( ) ;
				System.out.print (" ENTER PRODUCT UNITPRICE : " ) ;
				int d = sc .nextInt ( ) ;
				ProductB pb = new ProductB ( a , b , c , d ) ;
				order [ i ] [ j ] = pb ;
				order [ i ] [ j ] . total = order [ i ] [ j ] . calculate ( ) ;
			}
		}
		for(int i = 0 ; i < n ; i++){
			int sum = 0 ;
			System.out.println("ORDER NUMBER : " + ( i +1) ) ;
			Date date=java.util.Calendar.getInstance() . getTime ( ) ;
			System.out.println( date ) ;
		
			System.out.printf ("%5s %20s %25s %10s %10s " ,"PRODUCT ID " ,"NAME" , "QUANTITY" , " UNIT PRICE " ," TOTAL " ) ;
			System.out.println ( ) ;

			for( int j =0; j<order [ i ] . length ; j++){
				System.out.printf ("%5s %20s %25s %10s%10s " ,order[i][j].prodid ,order [ i ] [ j ] . name ,	order [ i ] [ j ] . quantity ,
				order [ i ] [ j ] . unitprice ,order [ i ] [ j ] . total ) ;
				System.out.println ( ) ;
			}
	
			for ( int k=0; k<order [i] . length ; k++)
				sum = sum + order[i] [k] . total ;
			System.out.println (" NET AMOUNT: " + sum) ;

			}
		}
}

/*
OUTPUT
 ENTER NUMBER OF ORDERS : 
1
 ENTER NUMBER OF PRODUCTS: 2
 ENTER PRODUCT 1 NAME : A
 ENTER PRODUCT ID: 101
 ENTER PRODUCT QUANTITY : 1
 ENTER PRODUCT UNITPRICE : 25
 ENTER PRODUCT 2 NAME : B
 ENTER PRODUCT ID: 102
 ENTER PRODUCT QUANTITY : 2
 ENTER PRODUCT UNITPRICE : 100
ORDER NUMBER : 1
Fri May 06 14:50:34 IST 2022
PRODUCT ID                  NAME                  QUANTITY  UNIT PRICE      TOTAL  
  101                    A                         1         25              25 
  102                    B                         2        100             200 
 NET AMOUNT: 225
*/


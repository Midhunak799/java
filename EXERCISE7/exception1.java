/*2. Find the average of N positive integers, raising a user
defined exception for each negative input.*/




import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}

}

class POSITIVE{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER OF ITEMS:");
		int nbr=sc.nextInt();
		System.out.println("-----------------------------------");
		
		int a;
		int total=0;
		int b=0;
		System.out.println("ENTER NUMBERS");		
		for(int i=nbr;i>0;i--){
			a= sc.nextInt();
			try{
				if(a>=0){
					b++;
					total=total+a;
				}
				else{
					throw new myException("NEGATIVE NUMBERS NOT ALLOWED\n-------------------\nENTER POSITIVE NUMBER");
					
				}
			
			}
			catch(myException ex){
				System.out.println(ex.getMessage()+"\n");
			
			}
			if(a<0){
			
				i=i+1;
		}
		}
		System.out.println("AVERAGE OF "+b+" POSITIVE NUMBERS="+(double)total/b);
	
	
	}


} 


/*OUTPUT
ENTER THE NUMBER OF ITEMS:5
-----------------------------------
ENTER NUMBERS
4
5
-5
NEGATIVE NUMBERS NOT ALLOWED
-------------------
ENTER POSITIVE NUMBER

6
7
8
AVERAGE OF 5 POSITIVE NUMBERS=6.0
*/


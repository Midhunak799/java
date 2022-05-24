/*Define 2 classes; one for generating multiplication
table of 5 and other for displaying first N prime numbers.
Implement using threads. (Thread class)*/


import java.util.*;
class mltpl extends Thread{

	public void run(){
		super.run();
		
		//System.out.println("multiplication table of 5");
		try{
			for(int i=1;i<11;i++){
		
			System.out.println(i+" * 5 = "+(5*i)+"\n");
			Thread.sleep(2000);
								
			}
		
		
		}
		catch(Exception e){
			System.out.println("THREAD INTEREPTED");
		
		}
	}

}






class prime extends Thread{

	int prim;
	prime(int p){
		this.prim=p;
	
	}
	public void run(){
		super.run();
		
		
		boolean pr;
		
		try{
			for(int i=2;i<prim;i++){
					pr=true;
				for(int j=2;j<=i/2;j++){
							
					if(i%j==0){
						pr=false;
						
					}
				}
				if(pr){
				System.out.println("PRIME NUMBER "+i+"\n");
				}
				
			Thread.sleep(2000);
									
			}
		
		
	
		}
		catch(Exception e){
			System.out.println("THREAD INTEREPTED");
		
		}
	}

}



class thread1{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n ENTER THE NUMBER FOR LIMIT OF PRIME NUMBER");
		int n=sc.nextInt();
		
		mltpl m = new mltpl();
		prime p= new prime(n);
		p.start();
		m.start();
}
}


/*
OUTPUT

ENTER THE NUMBER FOR LIMIT OF PRIME NUMBER
10
PRIME NUMBER 2

1 * 5 = 5

PRIME NUMBER 3

2 * 5 = 10

3 * 5 = 15

PRIME NUMBER 5

4 * 5 = 20

5 * 5 = 25

PRIME NUMBER 7

6 * 5 = 30

7 * 5 = 35

8 * 5 = 40

9 * 5 = 45

10 * 5 = 50
*/		
      
                

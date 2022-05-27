/*4. Define 2 classes; one for generating Fibonacci
numbers and other for displaying even numbers in a
given range. Implement using threads. (Runnable
Interface)*/


import java.util.*;

class Fibonacci implements Runnable{
		int n;
		Fibonacci(int fib){
			this.n=fib;
		
		}
		
		public void run(){
			
			int a=0,b=1;
			try{if(n==1){
				System.out.println("FIBONACCI SERIES \n");
				
			}
			else{
				int f=0;
				System.out.println("FIBONACCI 0");
                                System.out.println("FIBONACCI 1");
				while(0<n-2){
					f=a+b;
					a=b;
					b=f;
					System.out.println("FIBONACCI "+f);
					n--;
					Thread.sleep(500);
				}
				
			}	
		}
		catch(Exception e){
			System.out.println("SOMETHING WRONG");
		}
		}
}

class Even implements Runnable{
	int evn;
	Even(int a){
		this.evn=a;
		
	}
	public void run(){
		
		try{for(int i=1;i<=evn;i++){
			if(i%2==0){
				System.out.println("EVEN NUMBER:"+i);
				Thread.sleep(500);
                                 			
				}
		
			}
		}
		catch(Exception e){
			System.out.println("SOMETHING WRONG");
		}
	
	}

}





class thread2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER LIMIT:");
		int u=sc.nextInt();
		System.out.println("-----------------");

		Fibonacci f= new Fibonacci(u);
		Thread th = new Thread(f);
		
		
		Even evn =new Even(2*u);
		Thread th1 = new Thread(evn);
		th1.start();
		th.start();
		
		
		
		
	}

}



/*OUTPUT
ENTER LIMIT:8
------------------------
EVEN NUMBER:2
FIBONACCI 0
FIBONACCI 1
FIBONACCI 1
EVEN NUMBER:4
FIBONACCI 2
EVEN NUMBER:6
FIBONACCI 3
EVEN NUMBER:8
FIBONACCI 5
FIBONACCI 8
EVEN NUMBER:10
FIBONACCI 13
EVEN NUMBER:12
EVEN NUMBER:14
EVEN NUMBER:16

*/

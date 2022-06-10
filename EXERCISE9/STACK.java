/*1. Program to create a generic stack and do the Push and Pop
operations.
*/

import java.util.*;
class StackOperations<T>{
	
	
	void push(ArrayList<T> arr,T item){
		
		
		
		arr.add(item);
	
	}
	void pop(ArrayList<T> arr){
		if(arr.isEmpty()){
			System.out.println("STACK IS EMPTY");
		}
		else{
		
		int index = arr.size()-1;
		System.out.println("POPED ITEM IS : "+arr.get(index));
		arr.remove(index);
		}
	}
	void Display(ArrayList<T> arr){
			System.out.println("ELEMENTS IN STACK");
		for(T elements :arr){
			System.out.print(elements+"\t");
		}
	
	}
	

}

public class stack{
	public static void main(String ar[]){
		StackOperations stk=new StackOperations();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> sr=new ArrayList<String>();
		ArrayList<Integer> AI=new ArrayList<Integer>();
		
		
		
		
		
		
		while(true){
				System.out.println("\n1.PUSH\n2.DISPLAY\n3.POP\n4.EXIT");
				System.out.println("\nSELECT OPTION");
				int ch=sc.nextInt();
				
				
				switch(ch){
					case 1:	
							System.out.println("ENTER ITEM TO PUSH");
							String item=System.console().readLine();
							stk.push(sr,item);
							break;
					case 2:
							stk.Display(sr);
							
							break;
					case 3: 
							stk.pop(sr);
							break;
					default:
							System.exit(0);				
				}

		}
		
			
		
	
	}
}



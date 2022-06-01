/*3. Program to remove an object from the Stack when the position is passed
as parameter*/
import java .util.*;

class StackDemo{
	public static void main(String args[]){
		Stack<Integer>stk =new Stack<Integer>();
		stk.push(10);
		stk.push(100);
		stk.push(1000);
		stk.push(10000);
		stk.push(100000);
		stk.push(1000000);
		stk.push(10000000);
		System.out.println("SIZE OF THE STACK:"+stk.size());
		
		System.out.println("CONTENTS IN STACK:"+stk);
		stk.removeElementAt(3);
		System.out.println("CONTENTS IN STACK AFTER REMOVED INDEX 3:"+stk);

		
	}


}

/*OUTPUT
SIZE OF THE STACK:7
CONTENTS IN STACK:[10, 100, 1000, 10000, 100000, 1000000, 10000000]
CONTENTS IN STACK AFTER REMOVED INDEX 3:[10, 100, 1000, 100000, 1000000, 10000000]

*/

/*5. Program to demonstrate the addition and deletion of elements in deque*/

import java.util.*;
public class deque {
	public static void main(String[] args) {
		Deque<Integer> dqu = new ArrayDeque<>();
		
		dqu.add(5);
		dqu.add(55);
		dqu.add(555);
		dqu.add(5555);
		dqu.add(55555);
		dqu.add(555555);
		System.out.println("AFTER INSERTING ELEMENTS IN DEQUEUE: ");
		for (int i : dqu) {
			System.out.print(i+"\t");
		}
		
		dqu.pop();
		System.out.println("\nAFTER POPOING ELEMENTS IN DEQUEUE: ");
		for (int i : dqu) {
			System.out.print(i+"\t");
		}
		
		dqu.remove(4);	
		System.out.println("\n ELEMENT 4 IS REMOVED :"+dqu);
	}

}
/*OUTPUT
AFTER INSERTING ELEMENTS IN DEQUEUE: 
5	55	555	5555	55555	555555	
AFTER POPOING ELEMENTS IN DEQUEUE: 
55	555	5555	55555	555555	
 ELEMENT 4 IS REMOVED :[55, 555, 5555, 55555, 555555]
*/

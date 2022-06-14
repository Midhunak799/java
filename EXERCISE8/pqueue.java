/*4. Program to demonstrate the creation of queue object using the
PriorityQueue class*/
import java.util.*;

class pque {
	public static void main(String args[]){
		PriorityQueue<String>pq =new PriorityQueue<String>();
		pq.add("DHONI");
		pq.add("RAINA");
		pq.add("SACHIN");
		pq.add("KOHLI");
		pq.add("YUVARAJ");
		pq.add("SEWAG");
		System.out.println("CONTENTS IN PQUEUE"+pq);

		Iterator<String> itr=pq.iterator();


		System.out.println("\nUSING ITERATOR PRINT ELEMENTS IN QUEUE\n");
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}		
		System.out.println();
	}

}
/*OUTPUT
CONTENTS IN PQUEUE[DHONI, KOHLI, SACHIN, RAINA, YUVARAJ, SEWAG]

USING ITERATOR PRINT ELEMENTS IN QUEUE

DHONI	KOHLI	SACHIN	RAINA	YUVARAJ	SEWAG	*/

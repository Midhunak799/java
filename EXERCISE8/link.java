/*
2. Program to remove all the elements from a linked list
*/
import java.util.*;

class LinkList {

public static void main(String args[]) {

	LinkedList<String> lst=new LinkedList<String>();
	                                                   

		lst.add("RED");
		lst.add("GREEN");
		lst.add("ORANGE");
		lst.add("WHITE");
		lst.add("BLACK");
		lst.addLast("YELLOW");
		lst.addFirst("BLUE");
		System.out.println("SIZE OF lst BEFORE DELETION: " + lst.size());
		System.out.println("CONTENTS OF lst BEFORE DELETIION: " + lst);
		
		lst.removeFirst();
		lst.removeLast();	
		System.out.println("CONTENTS OF lst REMOVE FIRST AND LAST ELEMENT: " + lst);
                System.out.println("CONTENTS OF lst AFTER DELETION: " + lst);

		                      //REMOVING ALL ELEMENTS FROM LIST
		lst.clear();
		
		System.out.println("CONTENTS OF lst AFTER DELETION OF ALL ELEMENTS: " + lst);


}
}


/*OUTPUT
SIZE OF lst BEFORE DELETION: 7
CONTENTS OF lst BEFORE DELETIION: [BLUE, RED, GREEN, ORANGE, WHITE, BLACK, YELLOW]
CONTENTS OF lst REMOVE FIRST AND LAST ELEMENT: [RED, GREEN, ORANGE, WHITE, BLACK]
CONTENTS OF lst AFTER DELETION: [RED, GREEN, ORANGE, WHITE, BLACK]
CONTENTS OF lst AFTER DELETION OF ALL ELEMENTS: []
*/

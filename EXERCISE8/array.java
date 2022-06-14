/*1. Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations*/



import java.util.*;


class ArrayListEx{
	public static void main(String args[]) 	{

		// CREATING ARRAY LIST
		ArrayList<String> alist = new ArrayList<String>();

		System.out.println("INITIAL SIZE OF ARRAY LIST: " + alist.size());
                System.out.println("-------------------------------------------------");
		// INSERTING ELEMENTS TO ARRAY LIST
		System.out.println("AFTER INSERTING VALUES INTO ARRAY LIST");
		alist.add("BAT");
		alist.add("BALL");
		alist.add("HELMET");
		alist.add("JERSY");
		alist.add("STUMP");
		
		System.out.println("CONTENTS OF ARRAY LIST: "+alist);
		System.out.println("\nCRICKET PAD ADDES 4TH INDEX POSITION\n");
		alist.add(4,"CRICKET PAD");
		System.out.println("CONTENTS OF ARRAY LIST :"+alist);

		System.out.println("\nARRAY SIZE AFTER ADDITION  " + alist.size());


		
		alist.remove("CRICKET PAD");
		System.out.println("\nCONTENTS AFTER REMOVED CRICKET PAD IN ARRAY LIST :"+alist); 
		String s=alist.get(3);
		alist.remove(3);
		System.out.println("\nCONTENTS AFTER REMOVED "+s+" IN ARRAY LIST :"+alist); 
	}
	


}



/*OUTPUT
INITIAL SIZE OF ARRAY LIST: 0
-------------------------------------------------
CONTENTS OF ARRAY LIST: [BAT, BALL, HELMET, JERSY, STUMP]

CRICKET PAD ADDES 4TH INDEX POSITION

CONTENTS OF ARRAY LIST :[BAT, BALL, HELMET, JERSY, CRICKET PAD, STUMP]

ARRAY SIZE AFTER ADDITION  6

CONTENTS AFTER REMOVED CRICKET PAD IN ARRAY LIST :[BAT, BALL, HELMET, JERSY, STUMP]

CONTENTS AFTER REMOVED JERSY IN ARRAY LIST :[BAT, BALL, HELMET, STUMP]
*/

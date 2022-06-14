/*7. Write a Java program to compare two hash set*/
import java.util.*;
 class ColorSet {
	public static void main(String[] args) {
		                                                   // Create a empty hash set
		HashSet<String> set=new HashSet<String>();
		
		set.add("BAT");
		set.add("BALL");
		set.add("GLOWS");
		set.add("JERSY");
		set.add("HELMET");
		
		System.out.println(set);
		HashSet<String> set2=new HashSet<String>();
		set2.add("BALL");
		set2.add("BAT");
		set2.add("JERSY");
		set2.add("HELMET");
		System.out.println(set2);

		                                                  //comparing output in hash set
		for (String element : set){		
		
		System.out.print(set2.contains(element) ? "BOTH HASHSET CONTAIN ELEMENTS IS  ": "BOTH HASHSET NOT CONTAIN ELEMENTS IS  " );
		System.out.println(element);
		}
	}
}


/*OUTPUT
[BALL, HELMET, BAT, GLOWS, JERSY]
[BALL, HELMET, BAT, JERSY]
BOTH HASHSET CONTAIN ELEMENTS IS  BALL
BOTH HASHSET CONTAIN ELEMENTS IS  HELMET
BOTH HASHSET CONTAIN ELEMENTS IS  BAT
BOTH HASHSET NOT CONTAIN ELEMENTS IS  GLOWS
BOTH HASHSET CONTAIN ELEMENTS IS  JERSY
*/


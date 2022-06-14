/*6. Program to demonstrate the creation of Set object using the
LinkedHashset class*/


import java.util.*;
 class linkedHash {
	public static void main(String[] args) {
		LinkedHashSet <String> hset = new LinkedHashSet<String>();
		hset.add("MATHS");
		hset.add("PHYSICS");
		hset.add("CHEMISTRY");
		hset.add("ZOOLOGY");
		hset.add("ENGLISH");
		hset.add("MALAYALAM");
		System.out.println("Set = "+hset);

		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
}
}

/*1. Program to demonstrate the working of Map interface
by adding, changing and removing elements.*/


import java.util.*;
public class hashmap {
	public static void main(String args[]){
		HashMap<String,Double>hmap =new HashMap<String,Double>();
		
		                          //HashMap<String, Double> hm = new HashMap<String, Double>();
		hmap.put("BAT",5000.0);
		hmap.put("BALL",1000.5);
		hmap.put("HELMET",2000.0);
		hmap.put("CAP",150.0);
		hmap.put("JERSY",200.0);
		hmap.put("SHOES",700.0);
		
		System.out.println("HASHMAP: "+hmap+"\n");
		
		hmap.remove("SHOES");
		
		System.out.println("SHOES REMOVED:"+hmap+"\n");
		
		double h= hmap.get("CAP");
		hmap.put("CAP",h+100.5);
		System.out.println("VALUE OF CAP IS CHANGED : "+hmap+"\n");
		
		
		Set<Map.Entry<String,Double>>set= hmap.entrySet();
		for(Map.Entry<String,Double>i : set){
			System .out.println(i.getKey()+" : "+i.getValue());
		}
	}			
}

/*output
HASHMAP: {BALL=1000.5, HELMET=2000.0, CAP=150.0, BAT=5000.0, SHOES=700.0, JERSY=200.0}

SHOES REMOVED:{BALL=1000.5, HELMET=2000.0, CAP=150.0, BAT=5000.0, JERSY=200.0}

VALUE OF CAP IS CHANGED : {BALL=1000.5, HELMET=2000.0, CAP=250.5, BAT=5000.0, JERSY=200.0}

BALL : 1000.5
HELMET : 2000.0
CAP : 250.5
BAT : 5000.0
JERSY : 200.0

*/

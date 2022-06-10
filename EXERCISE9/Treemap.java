/*2. Program to Convert HashMap to TreeMap*/


import java.util.*;
public class treemap {
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
		
		TreeMap<String,Double> tmap =new TreeMap<>();
		tmap.putAll(hmap);
		System.out.println("TREEMAP: "+tmap+"\n");				
	}
}

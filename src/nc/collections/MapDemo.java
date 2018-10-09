package nc.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "A");
	hm.put(2,"C");
	hm.put(3,"D");
	hm.put(1, "D");
	hm.put(null, null);
	hm.put(12, "A");
	hm.put(9, "E");
	
	System.out.println("Map => "+hm);
	
	System.out.println("Value of null keys "+hm.get(null));
	System.out.println("is contain 12 keys "+hm.containsKey(12));
	System.out.println("Replace msg" +hm.replace(null, "NONE"));
	
	System.out.println(hm);
	
	System.out.println("-----entrySet()-----------");
	
	Set set=hm.entrySet();
	
	Iterator it=set.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("-----------Only Values ------------");
	Collection col=hm.values();
it=col.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("-----------Only Keys ------------");
	set=hm.keySet();
it=set.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	LinkedHashMap lm=new LinkedHashMap<>();
	lm.put("", "");
	lm.put(null,null);
	lm.put(1,"1");
	lm.put("",null);
	lm.put(" ","None");
	
	System.out.println(lm);
	
	
	
	TreeMap<Integer, Integer> tm=new TreeMap<>();
	tm.put(1, 100);
	tm.put(5,500);
	tm.put(10,200);
	tm.put(0,0000);
	tm.put(7, 700);
	
	System.out.println("Sorted Map "+tm);
	
	Hashtable ht=new Hashtable<>();
	ht.put("", " null ");
	ht.put(1, "1");
	ht.put(tm, tm);
	ht.put(hm, tm);
	
	System.out.println(ht);
	
	set=ht.entrySet();
	
	it=set.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	ht.put(null, 1000000);
	
	System.out.println(ht);
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
	
	
	}

}

package nc.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("1");
		hs.add("2");
		hs.add(null);
		hs.add("1");
		hs.add("");
		hs.add(" ");
		hs.add(new String("1"));
		
		System.out.println(hs);
		
		System.out.println("is contain \"\" "+hs.contains(""));
		hs.remove("");
		
		System.out.println(hs);
		
		System.out.println("Fetch Element by ToArray(T[])");
		
		String s[]=new String[hs.size()];
		hs.toArray(s );
	int count=0;
		for (String string : s) {
			System.out.println("count "+(++count)+"\t"+string);
		}
		
		
		LinkedHashSet ls=new LinkedHashSet<>();
		ls.add(12);
		ls.addAll(hs);
		ls.add("New Item");
		ls.add("Last");
		
		System.out.println(ls);
		
	//	ls.clear();
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(-1);
		ts.add(90);
		ts.add(30);
		ts.add(2);
		ts.add(5);
		ts.add(8);
		System.out.println("Sorted Sets "+ts);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

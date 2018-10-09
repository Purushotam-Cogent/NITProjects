package nc.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		System.out.println(al.size());
		for(int i=0;i<=10;i++)
			al.add(i);
		
		al.add("JAva");
		al.add(1,"Python");
		al.add(new Object());
		
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		al.remove(6);
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println("index 5 "+al.get(5));
		
		System.out.println("is contain 2 "+al.contains(2));
		
		al.add(al);
		
		System.out.println("Array Object ");
		
		Object a[]=al.toArray();
		for (Object object : a) {
			System.out.println(object);
		}
		
		System.out.println("By Iterator ");
		Iterator ii=al.iterator();
		
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
		System.out.println("ListIterator");
		
		
		ListIterator li=al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.nextIndex()+"\t"+li.next());
		}
		
		System.out.println("Previous ");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previousIndex()+"\t"+li.previous());
		}
		LinkedList ll=new LinkedList<>();
		
		
		System.out.println("------------Linked List --------------");
		System.out.println(ll.size());
		for(int i=0;i<=10;i++)
			ll.add(i);
		
		System.out.println(ll.size());
		
		System.out.println(ll);
		
		ll.remove(6);
		
		System.out.println(ll.size());
		
		System.out.println(ll);
		ll.addLast("Last");
		ll.addFirst("Start");
		
		System.out.println("getfirst "+ll.getFirst());
		System.out.println("getLast "+ll.getLast());
		
		System.out.println("remove First "+ll.removeFirst());
		
		System.out.println("After Remove "+ll);
		System.out.println("peek "+ll.peek());
		System.out.println("pop "+ll.pop());
		System.out.println("After Pop "+ll);
		
	ll.push("Collections");
	
	System.out.println(ll);
	System.out.println("pop "+ll.pop());
	
	ll.add("Add new");
	System.out.println(ll);
	
	System.out.println();
		System.out.println();
		
		Vector<Integer> v=new Vector<>();
		v.addElement(122);
		v.add(2000);
		v.add(1, 9000);
		Enumeration ee=v.elements();
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
			
		}
		
		
		
		

	}

}

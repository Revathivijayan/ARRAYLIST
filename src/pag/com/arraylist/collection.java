package pag.com.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collection {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(30);
		li.add(10);
		li.add(40);
		li.add(60);
		
		int size=li.size();
		System.out.println(size);
	Integer integer=li.get(3);
	System.out.println(integer);
	boolean contains=li.contains(10);
	System.out.println(contains);
	int indexOf=li.indexOf(10);
	System.out.println(indexOf);
	int last=li.lastIndexOf(40);
	System.out.println(last);
     int integer1=li.set(4, 50);
     System.out.println(integer1);
     li.add(3,50);
     System.out.println(li);
     boolean empty=li.isEmpty();
     System.out.println(empty);  
     li.clear();
     System.out.println(li);
     
     for(int i=0;i<li.size();i++) {
    	 
    	 System.out.println(li.get(i));
     
     List<Integer>li1=new LinkedList<>();
     li1.add(100);
     li1.add(10);
     li1.add(300);
     System.out.println(li1);
     li1.addAll(li);
     System.out.println(li1);
     li1.removeAll(li);
     System.out.println(li1);
     li1.retainAll(li);
     System.out.println(li1);
	}
     
	}
}

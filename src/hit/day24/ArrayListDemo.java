package hit.day24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>();
		list.add("hello world");
		list.add(10);
		list.add(10.5);
		list.add(new Stone());
	for (int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	for(Object o:list) {
		System.out.println(o);
	}
	Iterator<Object> iter=list.iterator();
	while (iter.hasNext()) {
		System.out.println(iter.next());
	}
	ListIterator<Object> listiter=list.listIterator();
	while(listiter.hasNext()) {
		System.out.println(listiter.next());
	}
	while(listiter.hasPrevious()) {
		System.out.println(listiter.previous());
	}
	}
	
}
class Stone{
	public Stone() {
		// TODO Auto-generated constructor stub
		System.out.println("Stone Constructor Called....");
	}
}



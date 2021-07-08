package hit.day28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ColDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>(10);
		list.add("i'm");
		list.add("a");
		list.add("programmer");
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(1,"and");
		System.out.println(list.contains("a"));
		System.out.println(list.indexOf("programmer"));
		System.out.println(list.size());
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator<String> iter=list.iterator();
			while(iter.hasNext())
				System.out.println(iter.next());
		ListIterator<String> listiter=list.listIterator();
			while(listiter.hasNext())
				System.out.println(listiter.next());
			while(listiter.hasPrevious())
				System.out.println(listiter.previous());
		
	}

}

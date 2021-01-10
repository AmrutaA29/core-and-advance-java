package Saturday.HashSet;

import java.util.*;

import Saturday.BeanChanda.BookInfo;

public class TestBeanChanda {
	public static void main(String[] args) {
		BookInfo bi1 = new BookInfo("Harry Potter and the Philosopher's Stone",1000,450);
		BookInfo bi2 = new BookInfo("Harry Potter and the Chamber of Secrets",2000,650);
		BookInfo bi3 = new BookInfo("Harry Potter and the Prisoner of Azkaban",3000,1050);
		BookInfo bi4 = new BookInfo("Harry Potter and the Goblet of Fire",4000,1450);
		
		Set<BookInfo> bi = new HashSet<BookInfo>();
		
		bi.add(bi1);
		bi.add(bi2);
		bi.add(bi3);
		bi.add(bi4);
		
		System.out.println("Using HashSet and for-each");
		for(BookInfo b:bi)
		{
			System.out.println(b);
		}
		
	}

}

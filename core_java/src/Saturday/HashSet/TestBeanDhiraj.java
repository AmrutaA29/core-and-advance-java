package Saturday.HashSet;

import java.util.*;

import Saturday.BeanDhiraj.Account;

public class TestBeanDhiraj {
	public static void main(String[] args) {
		
		Account a1 = new Account(101,"Amruta");
		Account a2 = new Account(011,"Siddhi");
		Account a3 = new Account(103,"Anushka");
		Account a4 = new Account(111,"Deeksha");
		
		Set<Account> a = new HashSet<Account>();
		
		a.add(a1);
		a.add(a2);
		a.add(a4);
		a.add(a3);
		
		System.out.println("***************Using HashSet and Iterator***********");
		Iterator<Account> iter = a.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}
		
	}

}

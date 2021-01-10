package Saturday.arrayListExample;

import java.util.*;

import Saturday.BeanArpita.InvitationCard;

public class TestBeanArpita {
	public static void main(String[] args) {
		
		InvitationCard ic1 = new InvitationCard("Amruta",4);
		InvitationCard ic2 = new InvitationCard("Arpita",4);
		InvitationCard ic3 = new InvitationCard("Anushka",4);
		InvitationCard ic4 = new InvitationCard("Chanda",4);
		
		ArrayList<InvitationCard> ic = new ArrayList<InvitationCard>();
		
		ic.add(ic1);
		ic.add(ic2);
		ic.add(ic3);
		ic.add(ic4);
		
		Iterator<InvitationCard> iter = ic.iterator();
		
		System.out.println("Using iterator and arrayList...");
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}
		
	}

}

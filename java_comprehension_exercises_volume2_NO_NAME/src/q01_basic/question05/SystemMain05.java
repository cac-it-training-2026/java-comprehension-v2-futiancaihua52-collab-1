package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		
		AbstMember m1 = new NonMember("Sato Kensuke");
		AbstMember m2 = new Member(1, "Password", "Miura Manabu", 28, 2);
		
		AbstMember[] members = new AbstMember[2];
		
		members[0]=m1;
		members[1]=m2;
	
		MemberManager.showAllMembers(members);
		
		System.out.println("---BUY ITEM---");
		for(AbstMember m:members) {
			m.buyItem();
		}

	}

}
																
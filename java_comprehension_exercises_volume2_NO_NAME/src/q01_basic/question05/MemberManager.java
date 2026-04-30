package q01_basic.question05;

public class MemberManager {
	private MemberManager() {}
	
	public static void showAllMembers(AbstMember[]members) {
		System.out.println("---SHOW MEMBERS---");
		for(AbstMember m:members) {
			m.showMember();
		}
	}
}

package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//
	public static void showAllMembera(Member[]members) {
		System.out.println("---SHOW ALL MEMBERS---");
		
		for(Member m:members) {
			m.showMember();
		}
	}

}

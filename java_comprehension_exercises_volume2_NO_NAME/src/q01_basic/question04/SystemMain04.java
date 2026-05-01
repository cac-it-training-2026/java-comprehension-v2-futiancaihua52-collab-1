package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member mem1 = new Member(1,"Password","MiuraManabu",28,2);
		Member mem2 = new Member(2,"aaaAAA","Sato Kensuke",43,1);
		//配列に格納
		Member[]members = {mem1,mem2};
		MemberManager.showAllMembera(members);
	}

}

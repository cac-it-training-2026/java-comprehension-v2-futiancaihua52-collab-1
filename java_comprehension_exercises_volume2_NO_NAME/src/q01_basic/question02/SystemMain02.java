package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		
		Member member = new Member();

		// Setterで値代入
		member.setName("Miura Manabu");
		member.setAge(30);
		member.setRank(1);
		
		// 表示
		System.out.println("--- SHOW DATA---");
		member.showMember();
		
		System.out.println(">>> RANK UP>>>");
		member.rankUp();
		
		System.out.println("---GET RANK---");
		System.out.println("newRank: " + member.getRank());	
	}
}
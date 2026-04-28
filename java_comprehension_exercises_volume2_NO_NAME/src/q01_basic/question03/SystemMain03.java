package q01_basic.question03;

public class SystemMain03 {
	
//引数なしコンストラクタ
	public static void main(String[] args) {
	Member mem1 = new Member();
//引数ありコンストラクタ
	Member mem2 = new Member("MiuraManabu",28,2);
	
	System.out.println("---SHOWDATA(Miura)---");
	mem2.showMember();
	}

}

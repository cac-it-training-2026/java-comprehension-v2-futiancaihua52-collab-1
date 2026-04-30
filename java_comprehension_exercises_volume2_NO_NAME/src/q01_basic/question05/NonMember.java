package q01_basic.question05;

public class NonMember extends AbstMember{

	public NonMember(String name) {
		this.name = name;
	}
	//オーバーライド
	public void buyItem() {
		System.out.println(name+"purchased this item at a fix price");
	}
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(name+ "is a non-member");
		System.out.println("*****************");
	}
}

package q01_basic.question04;

class Member {
	//フィールド
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	//引数なしのコンストラクタ
	public Member() {
	}
	//引数ありのコンストラクタ
	public Member(int id,String name, String password,int age,int rank) {
	this.id=id;
	this.password=password;
	this.name=name;
	this.age=age;
	this.rank=rank;
	}
//getter.setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("password:"+password);
		System.out.println("age:"+age);
		System.out.println("rank:"+rank);
}
}

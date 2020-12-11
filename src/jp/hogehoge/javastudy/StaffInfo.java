package jp.hogehoge.javastudy;

class Staff
{
	String name;
	int staffId;
	String email;
	
	public void sayHello() {
		System.out.println("名前 " + this.name);
		System.out.println("社員番号 " + this.staffId);
		System.out.println("メールアドレス " + this.email);
	}

	public Staff(String name, int staffId, String email) {
		super();
		this.name = name;
		this.staffId = staffId;
		this.email = email;
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada", 123456, "yamada_t@gmail.com");
		
		yamada.sayHello();
	}

}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada", 123456, "yamada_t@gmail.com");
		// yamada.sayHello();
		System.out.println("社員情報");
		System.out.println("氏名　" + yamada.getName());
		System.out.println("社員番号　" + yamada.getStaffId());
		System.out.println("メールアドレス　" + yamada.getEmail());
	}

}

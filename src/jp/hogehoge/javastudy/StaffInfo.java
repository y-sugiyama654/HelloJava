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

class RemoteStaff extends Staff 
{
	public String location;
	public RemoteStaff(String name, int staffId, String email) {
		super(name, staffId, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}

public class StaffInfo 
{

	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada", 0000001, "yamada_t@gmail.com");
		RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 0000002, "tanaka_h@gmail.com");
		tanaka.location = "大阪";
		
		// yamada.sayHello();
		System.out.println("社員情報");
		System.out.println("氏名　" + yamada.getName());
		System.out.println("社員番号　" + yamada.getStaffId());
		System.out.println("メールアドレス　" + yamada.getEmail());
		
		System.out.println("社員情報");
		System.out.println("氏名　" + tanaka.getName());
		System.out.println("社員番号　" + tanaka.getStaffId());
		System.out.println("メールアドレス　" + tanaka.getEmail());
		System.out.println("勤務地　" + tanaka.location);
	}

}

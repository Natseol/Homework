package Day0824;

interface InterfacePhone {
	String SIMNUMBER = "";
	public void installApp(String appName);
	void call(String who);
}

public abstract class Phone implements InterfacePhone {
	public String number;
	private String owner="김"; //인스턴스내에서 사용하기 위해 생성
	protected String operator = "엘쥐";
	public static String model = "아이폰";  // 클래스내에서 쓰기 위해 생성
	
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}//getter
	
	public void setOwner(String owner) {
		this.owner=owner;
	}//setter
	
	public void takeAPicture() {
		System.out.println("찰칵");
	}

	@Override
	public void call(String who) {
		System.out.println(owner + "가 "+ who + "에게 전화를 겁니다");
	}
	
}

class IPhone extends Phone {
	public static final String MANUFACTURER = "애플";
	public IPhone(String owner, String number) {
		super(owner);
//		this.owner = "gg";
		this.operator = "gg";
		this.number = number;
	}
	
	public void installApp(String appName) {
		System.out.println("아이폰에서 "+appName+"을 다운로드");
	}
}

class GalaxyPhone extends Phone {
	public static final String MANUFACTURER = "삼숑";
	public GalaxyPhone(String owner, String number) {		
		super(owner);
		this.operator = "gg";
		this.number = number;
	}
	
//	@Override
	public void installApp(String appName) {
		System.out.println("갤럭시에서 "+appName+"을 다운로드");
	}
	
}

class Player {
	private String nickName;
	public Player(String nickName)
	{
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return nickName;
	}
}

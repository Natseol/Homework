package Homework;

public class Hightempler extends ProtossUnit {
//	public String name;	
//	public String description;
//	public int prdMineral;
//	public int prdGas;
//	public int prdUnit;
//	public int[] prdSpeed;	
//	public String[] prdBuilding;
//	public String[] prdNeedBuild;
//	public char hotkey;
//	public int hp;
//	public int def;
//	public int defUpgrade;	
//	public int sight;
//	public double moveSpeed;
	public int[] mp;
//	public int shield;
//	public int shieldUpgrade;
//	public String[] attribute;
//	public int transport;
	public String attackName;
	public int attackDamage;
	public int attackUpgrade;
	public Double attackRange;
	public Double attackSpeed;
	public String attackTarget;
	public String[] skill;
	
	public Hightempler()
	{
		this.name = "고위 기사";
		this.description = "강한 사이오닉 능력을 지니고 있습니다. 환류를 사용할 수 있고 업그레이드하면 사이오닉 폭풍을 사용할 수 있습니다. 집정관으로 변신할 수 있습니다.";
		this.prdMineral = 50;
		this.prdGas = 150;
		this.prdUnit = 2;
		this.prdSpeed  = new int[] {50, 45};	
		this.prdBuilding = new String[] {"관문", "차원 관문"};
		this.prdNeedBuild =  new String[] {"기사단 기록보관소"};
		this.hotkey = 't';
		//생산

		this.hp = 40;
		this.def = 0;
		this.defUpgrade = 1;	
		this.sight = new int[] {10};
		this.moveSpeed = 2.016;
		this.mp = new int[] {50,150};
		this.shield = 40;
		this.shieldUpgrade = 1;
		this.attribute = new String[] {"경장갑","생체","사이오닉"};
		this.transport = 2;
		//기본 속성

		this.attackName = "사이오닉 폭발";
		this.attackDamage = 4;
		this.attackUpgrade = 1;
		this.attackRange = 7.0;
		this.attackSpeed = 1.75;
		this.attackTarget = "지상";
	}
}

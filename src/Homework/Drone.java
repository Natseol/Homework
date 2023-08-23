package Homework;

public class Drone extends ZergUnit{
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
	
	public Drone() 
	{
		this.name = "일벌레";
		this.description = "기본 일꾼 유닛입니다. 광물과 베스핀 가스를 채취할 수 있습니다. 구조물로 변이할 수 있습니다.";

		this.prdMineral = 50;
		this.prdGas = 0;
		this.prdUnit = 1;
		this.prdSpeed  = new int[] {17};	
		this.prdBuilding = null;
		this.prdNeedBuild = null;
		this.hotkey = 's';
		//생산

		this.hp = 40;
		this.def = 0;
		this.defUpgrade = 1;	
		this.sight = new int[] {8,4};
		this.moveSpeed = 2.8125;				
		this.attribute = new String[] {"경장갑","생체"};
		this.transport = 1;
		//기본 속성

		this.attackName = "발톱";
		this.attackDamage = 5;
		this.attackUpgrade = 0;
		this.attackRange = 0.1;
		this.attackSpeed = 1.5;
		this.attackTarget = "지상";
		//공격
	}
}

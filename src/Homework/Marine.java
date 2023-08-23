package Homework;

public class Marine extends TerranUnit {
	public String attackName;
	public int attackDamage;
	public int attackUpgrade;
	public Double attackRange;
	public Double attackSpeed;
	public String attackTarget;
	Skill skill = new Skill();
	
	public Marine()
	{
		this.name = "해병";
		this.description = "다목적 보병입니다.";

		this.prdMineral = 50;
		this.prdGas = 0;
		this.prdUnit = 1;
		this.prdSpeed  = new int[] {25};	
		this.prdBuilding = new String[] {"병영"};
		this.prdNeedBuild = null;
		this.hotkey = 'a';
		//생산

		this.hp = 45;
		this.def = 0;
		this.defUpgrade = 1;	
		this.sight = new int[] {9};
		this.moveSpeed = 2.25;		
		this.attribute = new String[] {"경장갑","생체"};
		this.transport = 1;
		//기본 속성

		this.attackName = "C-14 가우스 소총";
		this.attackDamage = 6;
		this.attackUpgrade = 1;
		this.attackRange = 5.0;
		this.attackSpeed = 0.8608;
		this.attackTarget = "지상, 공중";
		//공격
		
		skill.name = "전투 자극제 사용";
		skill.description = "몇 초 동안 이동 및 공격 속도를 크게 향상시키는 강력한 전투 자극제를 유닛에게 투여합니다. 유닛은 체력 10만큼의 상처를 입습니다.";
		skill.hotkey = 't';		
	}
}

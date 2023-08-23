package Homework;

public class Hightempler extends ProtossUnit {
	public int[] mp;
	public String attackName;
	public int attackDamage;
	public int attackUpgrade;
	public Double attackRange;
	public Double attackSpeed;
	public String attackTarget;
	AttackSkill[] attackSkill = new AttackSkill[2];
	Skill skill = new Skill();
		
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
		
		attackSkill[0] = new AttackSkill(
				"환류",
				"대상의 에너지를 모두 소진시키고, 소진된 에너지 1당 0.5의 피해를 줍니다.",
				'f',
				0,
				"",
				10,
				50,
				0,
				0,
				50);
		
		attackSkill[1] = new AttackSkill(
				"사이오닉 폭풍",
				"4초동안 지속되는 사이오닉 에너지의 폭풍을 생성하여, 대상 지역에 있는 모든 유닛에게 최대 80의 피해를 줍니다.",
				't',
				2,
				"사이오닉 폭풍 업그레이드",
				9,
				75,
				4,
				1.5,
				20);
		
		skill.name = "집정관 소환";
		skill.description = "기사 두 명을 희생하여 집정관을 탄생시킵니다.";
		skill.hotkey = 'c';
		
	}	
}	


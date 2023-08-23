package Homework;

public class AttackSkill extends Skill {

	public int damage;
	
	public AttackSkill(
			String name,
			String description,
			char hotkey,
			double cooldown,
			String needUpgrade,
			int range,
			int mp,
			int duration,
			double area,
			int damage
			)
	{
		super(name,
				description,
				hotkey,
				cooldown,
				needUpgrade,
				range,
				mp,
				duration,
				area);
		this.damage=damage;
	}
}

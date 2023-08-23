package Homework;

public class Skill {
	public String name;
	public String description;
	public char hotkey;
	public double cooldown;	
	public String needUpgrade;
	public int range;	
	public int mp;
	public int duration;
	public double area;	
	
	public Skill()
	{		
	}
	
	public Skill(
			String name,
			String description,
			char hotkey,
			double cooldown,
			String needUpgrade,
			int range,
			int mp,
			int duration,
			double area
			)
	{
		this.name = name;
		this.description=description;
		this.hotkey=hotkey;
		this.cooldown=cooldown;
		this.needUpgrade=needUpgrade;
		this.range=range;
		this.mp=mp;
		this.duration=duration;
		this.area=area;
	}
}

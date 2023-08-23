package Homework;

public class Main {

	public static void main(String[] args) {
		Hightempler h1 = new Hightempler();
		String str = h1.attackSkill[1].name;
		System.out.println(str);		
		
		Drone d1 = new Drone();
		String str1 = d1.droneSkill.skill[0].name;
		System.out.println(str1);
		
		Marine m1 = new Marine();
		String str2 = m1.skill.name;
		System.out.println(str2);
	}
}


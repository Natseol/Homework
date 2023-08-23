package Homework;

public class DroneSkill{

	Skill[] skill = new Skill[7];
	
	public DroneSkill()
	{
		skill[0] = new Skill(
				"채취",
				"선택한 광물 지대나 베스핀 간헐천에서 건설로봇이 자원을 채취합니다.",
				'g',
				0,
				"",
				0,
				0,
				0,
				0);
		
		skill[1] = new Skill(
				"자원 반환",
				"운반한 자원을 가장 가까운 자원 수집 구조물로 옮깁니다.",
				'c',
				0,
				"",
				0,
				0,
				0,
				0);
		
		skill[2] = new Skill(
				"기본 변이",
				"기본 건물의 목록입니다.",
				'b',
				0,
				"",
				0,
				0,
				0,
				0);
		
		skill[3] = new Skill(
				"고급 변이",
				"고급 건물의 목록입니다.",
				'v',
				0,
				"",
				0,
				0,
				0,
				0);
		
		skill[4] = new Skill(
				"스프레이",
				"현재 장착한 스프레이를 대상 위치의 지형에 그립니다.",
				'y',
				300,
				"",
				0,
				0,
				0,
				0);
		
		skill[5] = new Skill(
				"잠복",
				"땅속으로 몸을 숨깁니다. 잠복 상태에서는 적을 공격하거나 움직일 수 없으며 탐지 기능 없이는 위치가 발각되지 않습니다.",
				'd',
				1.333d,
				"잠복 업그레이드",
				0,
				0,
				0,
				0);
		
		skill[6] = new Skill(
				"잠복 해제",
				"지상으로 모습을 드러냅니다.",
				'r',
				1,
				"잠복 업그레이드",
				0,
				0,
				0,
				0);
	}
}

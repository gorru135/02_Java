package edu.kh.oop.practice.model;

import edu.kh.oop.practice.model.vo.HeroService;

public class service {

	public void practice() {
		
		HeroService warrior = new HeroService();
		
		HeroService wizard = new HeroService();
		
		warrior.setNickName("수찬");
		warrior.setJob("학생");
		warrior.setHp(100);
		warrior.setMp(100);
		warrior.setLevel(1);
		warrior.setExp(0);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성 되었습니다. 현재 레벨 : %d\n",
				warrior.getJob(), warrior.getNickName(),warrior.getLevel());
		
		wizard.setNickName("박수찬");
		wizard.setJob("백수");
		wizard.setHp(200);
		wizard.setMp(100);
		wizard.setLevel(1);
		wizard.setExp(0);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성 되었습니다. 현재 레벨 : %d\n",
				wizard.getJob(), wizard.getNickName(),wizard.getLevel());
		
		System.out.println("======================================");
		
	}
}

package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service;
import edu.kh.oop.practice.model.vo.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		HeroService hs = new HeroService();
		
		service sv = new service();
		
		hs.magicjump();
		hs.attack(500);
	}
}

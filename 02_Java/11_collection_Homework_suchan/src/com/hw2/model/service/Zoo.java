package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo {
	Scanner sc = new Scanner(System.in);
	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {}
	
	public void addAnimal() {
		
		animals.add(new Monkey("원숭이"));
		animals.add(new Tiger("호랑이"));
	}
	
	public void showAnimals() {
		System.out.println("동물을 선택해주세요 : ");
		
		for(Animal ani : animals) {
			
			ani.sound();
		}
	}
	
	public void diplayMenu() {
		System.out.println("***** KH 동물원 *****");
		
		int num = 0;
		
		do {			
			System.out.println("원하는 작업을 선택하세요: ");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			num = sc.nextInt();
			
			switch(num){
			
			case 1 : showAnimals(); break;
			case 2 : System.out.println("프로그램을 종료합니다. "); break;
			default : System.out.println("잘못된 선택입니다. 다시 선택해주세요...");
			}
			
			
		} while(num != 2);
		
	}
}

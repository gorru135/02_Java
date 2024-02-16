package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal{

	
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	public Fish(String type, String eatType) {
		super(type,eatType);
	}
	
	@Override
	public void eat() {
		
		System.out.println("입을 뻐끔뻐끔 거리면서 먹는다.");
	}

	@Override
	public void breath() {
		System.out.println("아가미로 숨쉰다");
	}

	@Override
	public void move() {
		System.out.println("지느러미로 헤엄치며 움직인다.");
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fish : " + super.toString();
	}
}

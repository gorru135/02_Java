package edu.kh.oop.practice.model.vo;

public class HeroService {
		
	private String nickName; // 직업 
	private String job; // 직업 
	private int hp; // 체력 
	private int mp; // 마력
	private int level; // 레벨
	private int exp; // 경험치
	
	public String getJob() {
		return job;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void attack(int exp) {
				
		System.out.println(nickName + "은/는 공격을 했다!");
		
		this.exp += exp;
		
		if(this.exp > 500) {
			level += 1;
			System.out.println("레벨이 올랐습니다! 현재레벨 : " + level);
			
		}
	}
	
	public void magicjump() {
		
		
		if(this.mp <= 0) {
			System.out.println("더 이상 매직 점프할 수 없어요!");
			
		} else{
			
			this.mp -= 10;
			System.out.println(nickName + "의 점프!");
		}
		
	}
	
}

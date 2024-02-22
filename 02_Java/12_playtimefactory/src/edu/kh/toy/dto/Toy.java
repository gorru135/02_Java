package edu.kh.toy.dto;

import java.util.Objects;
import java.util.Set;

public class Toy implements Comparable<Toy>{

	private String name;//장난감 이름
	private int age; // 사용연령 
	private int price; // 장난감 가격 
	private String color; // 색상
	private int manufacturing; //제조년월일
	//private String Materials;
	private Set<String> materials; // 사용재료  
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, 
			int manufacturing,  Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufacturing = manufacturing;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(int manufacturing) {
		this.manufacturing = manufacturing;
	}

	
	
	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
	
		return "이름 : "+name+"/"+ "가격 : "+price+"/"+"색상 : "
		+color+"/"+"사용가능연령 : "+age+"/"+"제조년월일 : "+manufacturing+"/"+"재료 : /"+materials;
	}
	
    @Override
    public int compareTo(Toy otherToy) {
        // 제조일을 기준으로 비교
        return Integer.compare(this.manufacturing, otherToy.manufacturing);
    }

	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufacturing, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && manufacturing == other.manufacturing
				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
}

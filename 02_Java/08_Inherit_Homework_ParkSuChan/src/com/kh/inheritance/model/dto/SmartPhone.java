package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone{

	private String opearatingSystem;
	private int storageCapacity;
	
	
	
	public SmartPhone() {}
	
	

	public SmartPhone(String brand, String model, int year, int price, String opearatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.opearatingSystem = opearatingSystem;
		this.storageCapacity = storageCapacity;
	}



	@Override
	public void printlnfo() {
		
			super.printlnfo();
			System.out.println("OpearatingSystem : " + opearatingSystem);
			System.out.println("StorageCapacity : " + storageCapacity + "GB" );

			
		}
	

	public String getOpearatingSystem() {
		return opearatingSystem;
	}

	public void setOpearatingSystem(String opearatingSystem) {
		this.opearatingSystem = opearatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
}

package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{ // 경 차

	private double discoutOffer; // 할인혜택
	
	public Spark() {} // 기본생성자

	public Spark(String engine, String fuel, int wheel, double discoutOffer) {
		super(engine, fuel, wheel);
		this.discoutOffer = discoutOffer;
	}

	public double getDiscoutOffer() {
		return discoutOffer;
	}

	public void setDiscoutOffer(double discoutOffer) {
		this.discoutOffer = discoutOffer;
	}
	
	@Override
	public String toString() {

		return super.toString() + " / " + discoutOffer;
	}
}

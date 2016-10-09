package com.zhongtai.spring_demo.factorybean;

public class Car {

	private String pinpai;
	
	private String chandi;
	
	private int price;

	public String getPinpai() {
		return pinpai;
	}

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	public String getChandi() {
		return chandi;
	}

	public void setChandi(String chandi) {
		this.chandi = chandi;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [pinpai=" + pinpai + ", chandi=" + chandi + ", price=" + price + "]";
	}

	public Car(String pinpai, String chandi, int price) {
		super();
		this.pinpai = pinpai;
		this.chandi = chandi;
		this.price = price;
	}

	public Car() {
		super();
	}
	
	
}

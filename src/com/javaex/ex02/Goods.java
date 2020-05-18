package com.javaex.ex02;

public class Goods {
	private String name;
	private int price;
	
	//생성자를 새로만들면 기존에 안보이던 기본생성자가 사라져서 새로 만들어줘야 함
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}
}

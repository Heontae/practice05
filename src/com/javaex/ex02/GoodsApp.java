package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		Goods cup = new Goods("머그컵",2000);
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		cup.showInfo();
		
		//카메라 ==> 상품명: 니콘, 가격: 400000
		//컵       ==> 상품명: 머그컵, 가격 2000
	}

}

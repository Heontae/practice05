package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mb = new Member();

		// g/s
		mb.setName("정우성");
		mb.setId("jws");
		mb.setPoint(50000);
		mb.showinfo();
		// system.out.println(mb.toString());

		Member mb1 = new Member();
		mb1.setName("유재석");
		mb1.setId("yjs");
		mb1.setPoint(30000);
		mb1.showinfo();

		Member mb2 = new Member();
		mb2.setName("이효리");
		mb2.setId("lhr");
		mb2.setPoint(40000);
		mb2.showinfo();
	}

}

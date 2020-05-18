package com.javaex.ex04;

public class Base {

	public void service(String state) {
		// 코드작성할것
		if (state.equals("낮")) {
			day();
		} else if (state.equals("밤")) {
			night();
		} else if (state.equals("오후")) {
			afternoon();
		} else {
			System.out.println("잘못된 값 입니다.");
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night() {
		System.out.println("밤에는 숙면");
		// 코드작성할것
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}

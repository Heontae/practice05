package com.javaex.ex01;

public class Member {
	private String id;
	private String name;
	private int point;

	// g/s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 출력문
	public void showinfo() {
		System.out.println("회원정보: " + getName() + "(" + getId() + "), " + getPoint() + "점");
	}

	// to String
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
	}

}

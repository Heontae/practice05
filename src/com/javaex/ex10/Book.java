package com.javaex.ex10;

public class Book {
	int bookNo; // 번호
	String title; // 제목
	String author; // 작가
	int stateCode; // 상태코드(대여유무를 나타내는 코드)

	// 생성자
	Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	// g/s
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public void rent() {
		this.stateCode = 0;
		if (stateCode == 0) {
			System.out.println(title + "이(가) 대여 됐습니다.");
		}
	}

	// 출력문
	public void print() {
		if (stateCode == 1) {
			System.out.println(getBookNo() + "책 제목: " + title + ", 작가:" + author + ", 대여 유무:재고있음");
		} else if (stateCode == 0) {
			System.out.println(bookNo + "책 제목: " + title + ", 작가:" + author + ", 대여 유무:대여중");
		}
	}
	// to String

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]";
	}
	
}

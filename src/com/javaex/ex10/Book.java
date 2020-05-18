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

	// 메소드 --->stateCode가 1이면 대여가능 0이면 대여중 상품
	public void rent() { // 책번호를 선택하여 대여하는 메소드 대여가능한 상품을 대여하고 대여중으로 변경
		if (this.stateCode == 1) {
			System.out.println(title + "이(가) 대여 됐습니다.");
			this.stateCode = 0;
		} else if (this.stateCode == 0) {
			System.out.println("이미 대여중인 상품입니다.");
		}
	}

	public void rent2() { // 현재 대여중인 책 목록 보기. stateCode 값이 0인거 출력
		if (stateCode == 0) {
			System.out.println(bookNo + "번 책 제목: " + title + ", 작가:" + author);
		}
	}

	public void back() { // 책 번호를 선택하여 반납하기. 0번이 대여중,반납후 1번으로 변경 1번 대여가능
		if (this.stateCode == 0) {
			System.out.println(title + "이(가) 반납 됐습니다.");
			this.stateCode = 1;
		} else if (this.stateCode == 1) {
			System.out.println("대여중인 상품이 아닙니다.");
		}
	}

	// 출력문
	public void print() { // 출력문 stateCode가 1번이면 재고있음,0번이면 대여중
		if (stateCode == 1) {
			System.out.println(getBookNo() + "번 책 제목: " + title + ", 작가:" + author + ", 대여 유무:재고있음");
		} else if (stateCode == 0) {
			System.out.println(bookNo + "번 책 제목: " + title + ", 작가:" + author + ", 대여 유무:대여중");
		}
	}

// to String

//	@Override
//	public String toString() {
//		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]";
//	}

}

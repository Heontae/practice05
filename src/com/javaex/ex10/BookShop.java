package com.javaex.ex10;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		Book[] books = new Book[10];

		books[0] = new Book(1, "트와일라잇", "스테파니메이어");
		books[1] = new Book(2, "뉴문", "스테파니메이어");
		books[2] = new Book(3, "이클립스", "스테파니메이어");
		books[3] = new Book(4, "브레이킹던", "스테파니메이어");
		books[4] = new Book(5, "아리랑", "조정래");
		books[5] = new Book(6, "젊은그들", "김동인");
		books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
		books[7] = new Book(8, "귀천", "천상병");
		books[8] = new Book(9, "태백산맥", "조정래");
		books[9] = new Book(10, "풀하우스", "원수연");

		boolean exit = true;
		Scanner scanner = new Scanner(System.in);
		while (exit) {
			System.out.println("1.도서정보 보기 2.대여하기 3.대여목록 보기 4.반납하기 5.종료하기");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1://도서정보 보기
				System.out.println("*****도서 정보 출력하기******");
				displayBookInfo(books);
				break;
			case 2://도서 대여하기
				System.out.println("대여하실 책의 번호를 입력해주세요.");
				int num = scanner.nextInt();

				books[num - 1].rent();
				break;
			case 3://대여중인 대서목록보기
				System.out.println("현재 대여중인 책목록");
				for (int i = 0; i < books.length; i++) {
					if (books[i].stateCode == 0) {
						books[i].rent2();
					}
				}
				break;
			case 4://반납하기
				System.out.println("반납하실 책의 번호를 입력해주세요.");
				int back = scanner.nextInt();
				books[back - 1].back();
				break;
			case 5://프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				exit = false;
				break;
			default://잘못된 값 입력
				System.out.println("잘못 입력하였습니다.");
				break;

			}

		}
		scanner.close();
	}
	private static void displayBookInfo(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			books[i].print();
		}
		System.out.println();
	}
}

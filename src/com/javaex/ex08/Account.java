package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account() {

	}

	public Account(String accountNo) {// 계좌 개설
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}

	// 필요한 메소드 작성
	public void deposit(int money) {// 예금액 추가하기
		if (money <= 0) {
			System.out.print("잘못된 값을 입력하였습니다.");
		} else if (money > 0) {
			this.balance += money;
		}
	}

	public void withdraw(int money) {// 출금액 빼기
		if (money > this.balance && money>0) {
			System.out.print("잔고액을 초과하였습니다.");
		} else if(money < this.balance && money>0){
			this.balance -= money;
		}
	}

	public void showBalance() {// 잔고액 확인
		System.out.print(balance);
	}


	//g/s
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {// toString
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}

}

package edu.kh.oop.basic;

import java.util.Arrays;

//계좌 클래스 
public class Account {
	
		private String name; // 이름
		private String accountNumber; // 계좌번호
		private long balance;// 잔액
		private String password;// 비밀번호
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public long getBalance() {
			return balance;
		}
		public void setBalance(long balance) {
			this.balance = balance;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		public void deposit(long amount) {
			
			balance += amount;
			System.out.println(name + "의 현재 잔액 : " + balance);
		}
		
		public void withdraw(String pw,long amount) {
			
			if(!password.equals(pw)) {//비밀번호가 다를 경우 
				System.out.println("비밀번호 불일치");
				return; // 메서드 종료 -> 호출한곳으로 돌아감
			}
			//출금한 금액이 잔액보다 큰 경우 
			if(amount > balance) {
				System.out.println("잔액 부족");
				return;
			}
			
			// 잔액을 출금할 금액 만큼 차감 
			balance -= amount;
			
			System.out.printf("%s 계좌에서 %d원 출금\n", accountNumber, amount);
			System.out.println(name + "의 현재 잔액 : " + balance);
		}
		
		public void getinfo(String name,String name2) {
			String[] arr = new String[2]; 
			
			arr[0] = name;
			arr[1] = name2;
			System.out.println(Arrays.toString(arr));
			
			
		}
}


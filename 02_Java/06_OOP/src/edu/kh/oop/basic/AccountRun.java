package edu.kh.oop.basic;

public class AccountRun {

	public static void main(String[] args) {
		
		Account ac = new Account();
		Account ac1 = new Account();
		
		
		ac.setName("박수찬");
		ac.setAccountNumber("1234-56-7890");
		ac.setBalance(100000);
		ac.setPassword("1234");
		
		
		System.out.println(ac.getName() );
		System.out.println(ac.getAccountNumber() );
		System.out.println(ac.getBalance() );
		System.out.println(ac.getPassword() );

		
		ac.deposit(50000);
		ac.withdraw("1235", 2000); // 비밀번호 불일치
		ac.withdraw("1234", 12122000); // 잔액부족
		ac.withdraw("1234", 2000); 
		
		
		
		ac1.getinfo("김나나","홍길동");
		
	}
}

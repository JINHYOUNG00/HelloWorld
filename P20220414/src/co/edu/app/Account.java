package co.edu.app;

public class Account {
	//필드 : S 계좌번호, S 예금주, I 잔액
	private String accountNum;
	private String owner;
	private int balance;
	
	
	
	//생성자 :
	
	
	public Account(String accountNum, String owner, int balance) {
		super();
		this.accountNum = accountNum;
		this.owner = owner;
		this.balance = balance;
	}


	//Getter, Setter
	

	public String getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//메소드
	public void showInfo() {
		System.out.printf("계좌번호: %6s 예금주: %3s 잔액: %10d원\n", accountNum, owner, balance);
	}
	
	
	

}

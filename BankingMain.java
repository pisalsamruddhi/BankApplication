package Mypack;

public class BankingMain {

	
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(101,"Raja",15000);
		
		BankAccount b2=new BankAccount(102,"Rani",25000);
		
		b1.deposit(1000);
		b1.deposit(500);
		b1.withdraw(100);
		b1.deposit(500);
		
		System.out.println("-----------");
		TransactionDetails.showMiniStatement(101);
		
		

	}

}

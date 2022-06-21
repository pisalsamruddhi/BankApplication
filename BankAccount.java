package Mypack;

import java.util.Random;

public class BankAccount {
	private int actNumber; 
	private String customer;
	private int actBalance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int actNumber, String customer, int actBalance) {
		super();
		this.actNumber = actNumber;
		this.customer = customer;
		this.actBalance = actBalance;
	}

	public int getActNumber() {
		return actNumber;
	}

	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getActBalance() {
		return actBalance;
	}

	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}
  public void deposit(int depositAmount)
  {
	  actBalance+=depositAmount;
	  Random r =new Random();//util package
	  //after performing deposit we need to store details in an object
	  //of transaction class and then store that object in some collection such as Linked list.
	  
	  Transaction t =new Transaction(r.nextInt(),
			  actNumber,depositAmount,"deposit",actBalance);
	  TransactionDetails.addTransaction(t);
	  System.out.println("deposit completed and transaction stored");
  }
  public void withdraw(int withdrawAmount)
  
  {   
	  Random r =new Random();
	  if(withdrawAmount>actBalance){
	  try {
		throw new InsufficientBalanceException();//user define exception
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  actBalance-=withdrawAmount;
  
  Transaction t =new Transaction(r.nextInt(),
		  actNumber,withdrawAmount,"withdraw",actBalance);
  TransactionDetails.addTransaction(t);
  System.out.println("withdraw completed and transaction stored");

	
  }
	

}

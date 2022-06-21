package Mypack;

public class InsufficientBalanceException extends Exception {//checked exception
	public String toString()
	{
		return "Balance not sufficient";
	}

}

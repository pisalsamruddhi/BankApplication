package Mypack;

import java.util.LinkedList;
import java.util.List;



public class TransactionDetails {
	public static List<Transaction> trList=new LinkedList<>();
	public static void addTransaction(Transaction t){
		trList.add(t);
		
	}
	public static void showMiniStatement(int actNumber){
		
		System.out.println("mini statement for account number :" + actNumber);
		System.out.println();
		for(Transaction t : trList ){
			if(t.getActNumber()==actNumber){
				System.out.println(t.getTranNumber()+"-"+t.getTranType()+"-"+t.getTranAmount()+"-"+t.getBalanceAfterThisTransaction());
			}
		}
	}

}

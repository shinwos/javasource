package homework;

public class Account {
	 static final int MIN_BALANCE=0;
	 static final int MAX_BALANCE=1000000;
	 private int Balance=0;
	 
	 public int getBalance() {
		
		 return this.Balance;
	 }
	 
	 public void setBalance(int a) {
		if((a>=MIN_BALANCE)&&(a<= MAX_BALANCE))
		{ this.Balance = a;}
	 }
}

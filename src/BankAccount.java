
public class BankAccount {
	private int accountNumber; 
	private String name; 
	private int accountBalance; 
	int deduction = (-4); 
	
	//Overloaded Constructor 
	public BankAccount(int number, int balance, String ownerName) { 
		accountNumber = number;
		name = ownerName; 
		accountBalance = balance; 
	}
	
	//Default 
	public BankAccount() {
		this(0, 0, "ian");
		
	}
	

	//Accessors
	public int getNumber() {
		return accountNumber;
	}
	
	public int getAccountBalance() {
		return accountBalance + deduction; 
	}
	
	public String getName() {
		return name; 
	}
	
	//Mutator methods
	public void setAccountNumber(int newNumber) {
		accountNumber = newNumber; 
	}
	
	public void setAccountBalance(int newBalance) {
		accountBalance = newBalance + deduction; 
	}
	
	public void setName(String newName) {
		name = newName; 
	}
}
	

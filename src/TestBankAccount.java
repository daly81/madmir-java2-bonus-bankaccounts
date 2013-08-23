
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount ian = new BankAccount(); 
		BankAccount john = new BankAccount(); 
		BankAccount jane = new BankAccount( 78456, 254, "jane");
		
		System.out.println(" This is " + ian.getName() + " bank account his account number is " + ian.getNumber() + " and his account balance " + ian.getAccountBalance() + 
				" with the $4.00 monthly deduction");
		
		//Using set methods
		john.setAccountNumber(89725);
		john.setAccountBalance(400);
		BankAccount johnBankAccount = new BankAccount();
		john.setName("john");
		
		System.out.println("This is " + john.getName() + " bank account his account number is " + john.getNumber() + " and his account balance is " + john.getAccountBalance() +
				" with the $4.00 monthly deduction");
		
		System.out.println("This is " + jane.getName() + " bank account his account number is " + jane.getNumber() + " and his account balance is " + jane.getAccountBalance() +
				" with the $4.00 monthly deduction");
	}

}

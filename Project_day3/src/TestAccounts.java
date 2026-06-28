
public class TestAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
			
			//e.printStackTrace();    //developers -> Troubleshooting
			//System.out.println(e);	// Logging -> Audit System behavior
			System.out.println(e.getMessage());      //End user
		}
//		ac.withdraw(3000);
//		System.out.println(ac);
//		ac.withdraw(7000);
//		System.out.println(ac);
//		
//		ac.deposit(2000);
//		System.out.println(ac);
//		ac.deposit(5000);
//		System.out.println(ac);
		
	}

}

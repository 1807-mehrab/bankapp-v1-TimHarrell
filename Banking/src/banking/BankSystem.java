package banking;

import Account.Account;
import java.util.*;
public final class BankSystem {
	public ArrayList<Account> AccountDataBase;
	
	BankSystem() {
		AccountDataBase = new ArrayList<>();
	}
	public void start() {
		boolean exit = false;
		
		while(!exit) {
			int selection = makeSelection();
			switch(selection) {
				case 1: makeAccount(); break;
				case 2: AccessAccount(); break;
				case 3: DeleteAccount(); break;
				case 4: exit = true; break;
				default: break;
			}
		}
		
		
	}
	
	private int makeSelection() {
		System.out.println("Select an option: ");
		System.out.println("1: Make Account");
		System.out.println("2: Access Account");
		System.out.println("3: Delete Account");
		System.out.println("4: Exit");
		System.out.print("input number: ");
		Scanner in = new Scanner(System.in);
		System.out.println("");
		
		return in.nextInt();
	}
	public void makeAccount() {
		Account account = new Account();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter new userID: ");
		String userID = in.nextLine();
		System.out.print("Enter password: ");
		String password = in.nextLine();
		System.out.println("\n");
	}
	
	public void AccessAccount() {
		
	}
	
	public void DeleteAccount() {
		
	}
	
	
}
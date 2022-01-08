package Bank;
import java.util.Scanner;

public class ATM {
	
	public ATM () {
		Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
        accounts[i] = new Account(i, 100);
        }
        Scanner scan=new Scanner(System.in);
        int userID;
        do {
        	System.out.print("Enter an ID: ");
        	userID=scan.nextInt();
        	
        	if((userID>=accounts.length)||(userID<0)) {
        		System.out.println("Incorrect ID. Account cannot found.");
        	}
        	else {
        		int menu=0;
        		while(menu!=4) {
        			System.out.printf("Main Menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit\nEnter a Choice: ");
        			menu=scan.nextInt();
        			switch(menu) {
        			case 1:
        				System.out.println("The balance is "+accounts[userID].getBalance());
        				break;
        			case 2:
        				double money;
        				System.out.print("Enter an Amount to Withdraw: ");
        				money=scan.nextDouble();
        				accounts[userID].Withdraw(money);
        				break;
        			case 3:
        				double amount;
        				System.out.print("Enter an Amount to Deposit: ");
        				amount=scan.nextDouble();
        				accounts[userID].Deposit(amount);
        				break;
        			case 4:
        				break;
        			}
        		}
        	}
        	
        	
        }while(true);
        
        
        
     }
}
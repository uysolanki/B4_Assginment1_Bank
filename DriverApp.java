import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(1234,"alice@123");
		IndianBankImpl bank=new IndianBankImpl();
		int choice;
		Scanner sc=new Scanner(System.in);  
		if(customer.login(1234, "alice@123"))
		{
			System.out.println("Login Successfull, Welcome");
			do
			{
			System.out.println("**** BANKING MENU ****");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Bal");
			System.out.println("4. Transfer");
			System.out.println("5. Exit");
			
			System.out.println("Please enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println("Please enter Amount to deposit"); //1000
				double dAmount=sc.nextInt();
				if(dAmount>0)
				{
				bank.Deposit(dAmount); //dAmount actual parameter
				System.out.println("Money Deposited");
				}
				else
				{
					System.out.println("Please enter valid amount");
				}
				break;
			case 2: 
				System.out.println("Please enter Amount to Withdraw");
				double wAmount=sc.nextInt();
				if(wAmount>0)
				{
				boolean b=bank.Withdrawal(wAmount); //dAmount actual parameter
				if(b==true)
				System.out.println("Money Withrawn");	
				}
				else
				{
					System.out.println("Please enter valid amount");
				}
					
				break;
			case 3 :
				double bal=bank.checkBalance();
				System.out.println("Balance : "+bal);
				break;
			
			case 4 :
				boolean t=bank.Transfer();
				if(t==true)
					System.out.println("Transfer Successfull");
				else
					System.out.println("Transfer Not Successfull");
				
				break;
			case 5: 
				System.exit(0);
			}

			}while(choice!=5);
		}
		else
		{
			System.out.println("Sorry, Invalid Credentials");
		}
	}

}

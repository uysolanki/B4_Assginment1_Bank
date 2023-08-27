import java.util.Scanner;

public class IndianBankImpl implements BankingService{

	double balance=5000;
	//double minBal=1000;
	@Override
	public double checkBalance() {
		return this.balance;
	}

	@Override
	public void Deposit(double amount) //formal parameter
	{
		this.balance=this.balance+amount;
		//or
		//this.balance+=amount;
	}

	@Override
	public boolean Withdrawal(double amount) {
		if(amount>balance)
		{
			System.out.println("Insufficient Funds");
			return false;
		}
		else
		{
			this.balance=this.balance-amount;	
		}
		return true;
	}

	@Override
	public boolean Transfer() {
		int GenOTP=OTPGenerator.getOTP();
		System.out.println("Generated OTP is  "+GenOTP); //7777
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter OTP received in SMS");
		int userOTP=sc.nextInt(); //7777
		if(GenOTP==userOTP)
		{
			System.out.println("Please enter Amount to Transfer");
			double tAmount=sc.nextDouble();
			if(tAmount>balance)
			{
				System.out.println("InSufficient Funds");
				return false;
			}
			else
			{
				this.balance-=tAmount;
				return true;
			}
			
		}
		else
		{
			System.out.println("Invalid OTP");
			return false;
		}
	}

}

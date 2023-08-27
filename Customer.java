
public class Customer {

	private int accNo;
	private String password;
	
	

	public Customer(int accNo, String password) {
		this.accNo = accNo;
		this.password = password;
	}

	public int getAccNo() {
		return accNo;
	}

//	public void setAccNo(Long accNo) {
//		this.accNo = accNo;
//	}

	public String getPassword() {
		return password;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	
	public boolean login(int accNo, String password)
	{
		if(this.accNo==accNo && this.password.equals(password))
			return true;
		else
			return false;	
	}
	
	
}

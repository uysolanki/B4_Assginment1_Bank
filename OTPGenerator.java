
public class OTPGenerator {

	public static int getOTP()
	{
		return ((int) (Math.random()*80)+1000);  
	}
}

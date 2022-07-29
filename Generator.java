
import java.util.*;

public class Generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pLength =  10;
	     int oLength = 4;
	     //Scanner sc = new Scanner(System.in);
	     System.out.println("Hello, I can genrate a random password and OTP for You!");
	     System.out.println("press 1 to generate password"); 
	    // int inp1 = sc.nextInt();
	     //if(inp1 == 1)
	     System.out.println(Password(pLength));
//	     Scanner sc1 = new Scanner(System.in);
//         System.out.println("press 2 to generate OTP"); 
//         int inp2 = sc1.nextInt();
	   //  if(inp == 2)
	         System.out.println(OTP(oLength));
	    

	}
	     
	     
	     static char[] Password(int len)
	     {
	       
	         System.out.print("Your new password is : ");

	         // A strong password has Cap_chars, Lower_chars,
	         // numeric value and symbols. So we are using all of
	         // them to generate our password
	         String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	         String Small_chars = "abcdefghijklmnopqrstuvwxyz";
	         String numbers = "0123456789";
	         String symbols = "!@#$%^&*_=+-/.?<>)";


	         String values = Capital_chars + Small_chars +
	                 numbers + symbols;

	         // Using random method
	         Random rndm_method = new Random();

	         char[] password = new char[len];

	         for (int i = 0; i < len; i++)
	         {
	             // Use of charAt() method : to get character value
	             // Use of nextInt() as it is scanning the value as int
	             password[i] =
	                     values.charAt(rndm_method.nextInt(values.length()));

	         }
	         return password;
	     }//password


	     static char[] OTP(int len)
	     {
	        
	         System.out.print("You OTP is : ");

	         // Using numeric values
	         String numbers = "0123456789";

	         // Using random method
	         Random rndm_method = new Random();

	         char[] otp = new char[len];

	         for (int i = 0; i < len; i++)
	         {
	             // Use of charAt() method : to get character value
	             // Use of nextInt() as it is scanning the value as int
	             otp[i] =
	                     numbers.charAt(rndm_method.nextInt(numbers.length()));
	         }
	         return otp;
	     }//otp
	
	
	

}//class

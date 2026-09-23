import java.util.function.*;


public class GenerateOTP {

	public static void main(String[] args) {
	
		Supplier<String> otpGenerator = () -> {
			String vowels = "AEIOU";
			
			char singleVowel = vowels.charAt((int)(Math.random() * 5)); 
			
			 StringBuilder otp = new StringBuilder();
			 otp.append(singleVowel);
			 
			for(int i = 0; i < 4; i++)
				otp.append((int) (Math.random() * 10)+1);
			
			
			return otp.toString();
		};
		
		System.out.println("Your OTP is: "+ otpGenerator.get());
		System.out.println("Your OTP is: "+ otpGenerator.get());
		System.out.println("Your OTP is: "+ otpGenerator.get());
		System.out.println("Your OTP is: "+ otpGenerator.get());
		System.out.println("Your OTP is: "+ otpGenerator.get());
	
	}

}

package com.accolite.intersys.signup;




import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class PasswordEncoder {
	
	private static MessageDigest md;
	
	
	public static String encode(String pass) throws NoSuchAlgorithmException
	{
		
	        md = MessageDigest.getInstance("MD5");
	        byte[] passBytes = pass.getBytes();
	        md.reset();
	        byte[] digested = md.digest(passBytes);
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<digested.length;i++){
	            sb.append(Integer.toHexString(0xff & digested[i]));
	        }
	        return sb.toString();
	    


	}
	
	
	
}

package myyproject;

import java.util.Random;

public class CredentialService 
{
      public String createEmail(Employee emp) 
      {
    	  return emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartmentName()+"greatlearning.com";
      }
      public String createPassword()
      {
    	  String generatedPassword="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@$#*%";
    	  Random ran=new Random();
    	 
    	  char []password=new char[8];
    	  for(int i=0;i<8;i++) 
    	  {
    		  int n=ran.nextInt(generatedPassword.length());
    		  password[i]=generatedPassword.charAt(n);
    	  }
    	  return String.valueOf(password);
      }
}

package myyproject;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your firstname");
    	String firstName=sc.next();
    	System.out.println("Enter your Lastname");
    	String lastName=sc.next();
    	System.out.println("choose from the following department");
    	System.out.println("1:technical");
    	System.out.println("2:Admin");
    	System.out.println("3:Hr");
    	System.out.println("4:legal");
    	int ch=sc.nextInt();
    	Employee emp;
    	switch(ch) 
    	{
    	   case 1:emp=new Employee(firstName,lastName,"technical");
    	   break;
    	   case 2:emp=new Employee(firstName,lastName,"Admin");
    	   break;
    	   case 3:emp=new Employee(firstName,lastName,"Hr");
    	   break;
    	   case 4:emp=new Employee(firstName,lastName,"legal");
    	   break;
    	   default:System.out.println("invalid output");
    	   return;
    	   
    	}
    	CredentialService cs=new CredentialService();
    	String emailid=cs.createEmail(emp);
    	String password=cs.createPassword();
    	System.out.println("Dear"+emp.getFirstName()+ "your generated credentials are as follows");
    	System.out.println("EmailId--->"+emailid);
    	System.out.println("Password-->"+password);
    }
	
}

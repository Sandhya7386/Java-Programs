package com.gqt_java.java_gqt.programs;
import java.util.Scanner;
class UnderAgeException extends Exception{
	private static final long serialVersionUID=1l;
	@Override
	public String getMessage()
	{
		return "You are under 18.Not eligible for licence";
	}

	
}
class OverAgeException extends Exception{
	private static final long serialVersionUID=1l;
	@Override
	public String getMessage()
	{
		return "You are above 60.Not allowed for licence";
	}

	}
class Licence{
	int age;
	Scanner sc=new Scanner(System.in);
	void collectData()
	{
		System.out.println("Enter the age");
		age=sc.nextInt();
	}
	void validateAge() throws UnderAgeException,OverAgeException{
		if(age<18)
		{
			throw new UnderAgeException();
		}
		else if(age>60)
		{
			throw new OverAgeException();	
		}
		else
		{
			System.out.println("Valid Age.You can get licence");
		}
	}
}
class LicenceSystem
{
	void licenceCheck(Licence l)
	{
		int attempts=0;
		while(attempts<3)
		{
			try {
				l.collectData();
				l.validateAge();
				return;
			
			}catch(UnderAgeException|OverAgeException e)
			{
				System.out.println(e.getMessage());
				attempts++;
			}
		}
		System.out.println("Too many invalid attempts.Uset Blocked");
	}
}
public class Launch9 {
	public static void main(String[] args) {
		Licence v=new Licence();
		LicenceSystem ls=new LicenceSystem();
		ls.licenceCheck(v);
		}

}

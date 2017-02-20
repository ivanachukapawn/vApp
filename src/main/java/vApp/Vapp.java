package vApp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Vapp
{

	public static void main(String[] args)
	{
		Scanner	input	=	new	Scanner(System.in);
		
		System.out.println("enter request queue name.");
		String	queueName	=	input.nextLine ();	
		
		ApplicationContext	context	
		=	new ClassPathXmlApplicationContext("vApp/beans/beans.xml");
		
		StartingMessage	message	=	(StartingMessage)context.getBean("startMessage");
		
		message.display(queueName);
		
		((ClassPathXmlApplicationContext)context).close ();
	}
}

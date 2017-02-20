package vApp;

public class StartingMessage
{
	public void display(String queueName)
	{
		System.out.println
		("Starting program to queue an activeMQ message to " +  queueName + 
		 " to the load-balanced backend");
	}
}

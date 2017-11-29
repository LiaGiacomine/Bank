package bank;

import java.util.Random;

	/**
	 * This class creates clients, along with their
	 * client login and pin number
	 */

public class Client
{
	private String firstname, lastname;
	private int balance;
	private int overdraft;
	private String clientID;
	private int idNumber = 0;
	private int pin;
	Random randomn = new Random();
	
	//Constructor
	public Client(String firstname,String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.overdraft = 0;
		this.balance = 0;
		this.clientID = setClientID();
		this.pin = generatePin();
	}
	

	public Client()
	{
	}
	

	/**
	 *  Getters
	 */
	
	//Name
	public String getName()
	{
		return firstname + lastname;
	}
	
	
	//Balance
	public int getBalance()
	{
		return balance;
	}
	
	//Client ID
	public String getClientID()
	{
		return clientID;
	}
	
	//Overdraft
	public int getOverdraft()
	{
		return overdraft;
	}
	
	public int getPinNumber()
	{
		return pin;
	}

	
	
	/**
	 *  Setters
	 */
	
	
	//Create Client ID
	private String setClientID()
	{
		this.clientID = "YOB" + this.lastname.substring(0, 3) + this.idNumber;
		idNumber++;
		return this.clientID.toString();
	}

	public int moneyIn(int amount)
	{
		this.balance += amount;
		return balance;
	}
	
	public int moneyOut(int amount)
	{
		this.balance -= amount;
		return balance;
	}
	
	
	private int generatePin() 
	{
		this.pin = randomn.nextInt(1245);
		return this.pin;
	}
	
	
	//Change surname
	public void changeLastname(String newLastName)
	{
		this.lastname = newLastName;
	}

	//Change overdraft
	public void changeOverdraft(int newOverdraft)
	{
		this.overdraft = newOverdraft;
	}
	
	public static void main(String[] args)
	{
	}
	
}

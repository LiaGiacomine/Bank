package bank;

import java.util.ArrayList;

/**
	 * This class is designed to keep track of all the clients in the bank
	 * along with their details. This will make it easier to select clients
	 * with highest earnings, those in debt to the bank etc.
	 */

public class BankData extends Client {
	
	public ArrayList<Client> clientlist;
	private int numberOfClients;

	
	public BankData()
	{
		setClientlist(new ArrayList<Client>());
		setNumberOfClients(0);
	}

	public void addClient(Client client)
	{
		getClientlist().add(client);
		setNumberOfClients(getNumberOfClients() + 1);
	}
	
	
	//Delete certain client using their id
	public void deleteClient(String clientId)
	{
		for (Client client: getClientlist())
		{
			if (client.getClientID() == clientId)
			{
				getClientlist().remove(client);
			}
		}
	}
	
	
	public void showClientlist()
	{
		for (Client client:getClientlist())
		{
			System.out.println(client.toString());
		}
	}
	
	public Client getClient(String firstname,String surname)
	{
		for (Client client:getClientlist())
		{
			return client;
		}
		return null;
		
	}
	
	public int getNumberOfClients() {
		return numberOfClients;
	}

	public void setNumberOfClients(int numberOfClients) {
		this.numberOfClients = numberOfClients;
	}
	
	public static void main(String[] args) 
	{
	}

	public ArrayList<Client> getClientlist() {
		return clientlist;
	}

	public void setClientlist(ArrayList<Client> clientlist) {
		this.clientlist = clientlist;
	}


	
	
	
}

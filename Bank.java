interface Banking 
{
void custmer_Acc();
void online_Acc();
}

interface UPI extends Banking
{
void Google_Acc();
void PhonePe_Acc();
}

class UnionBank   extends Exception implements UPI
{
private String name, acc, IFSC, Branch;
private float Bal;
private String Gupi;
private String Pupi;
public UnionBank()
	{
	super();
	}
public UnionBank(String name, String Gupi, float Bal)
	{
	this.name=name;
	this.Gupi=Gupi;
	this.Bal=Bal;
	} 
public UnionBank(float Bal, String Pupi, String name)
	{
	this.Bal=Bal;
	this.Pupi=Pupi;
	this.name=name;
	} 
public UnionBank(String name, String acc, String IFSC, String Branch, float Bal)
	{
	this.name	=name;
	this.acc	=acc;
	this.IFSC	=IFSC;
	this.Branch=Branch;
	this.Bal	=Bal;
	}

public void custmer_Acc()
	{
	System.out.println("WELCOME TO UNION BANK OF INDIA");
	System.out.println("Custmer Name: "+name);
	System.out.println("Custmer A/c No: "+acc);
	System.out.println("IFSC Code: "+IFSC);
	System.out.println("Branch : "+Branch);
	System.out.println("Avaiable Balance: "+Bal);
	if(Bal<=1000)
		{
		try
			{
			UnionBank b=new  UnionBank();
			throw b;
			}
		catch(UnionBank b)
			{
			System.out.println("Please Maintance Sufficient Balance");
			}
		}
	else
		{
		System.out.println("You are Maintaining Sufficient Balance Thank You");
		}
	System.out.println("\n"+"\n");
	}
public void online_Acc()
	{
	System.out.println("WELCOME TO COMMONWEALTH BANK OF AUSTRALIA");
	System.out.println("Custmer Name: "+name);
	System.out.println("Custmer A/c No: "+acc);
	System.out.println("IFSC Code: "+IFSC);
	System.out.println("Branch : "+Branch);
	System.out.println("Avaiable Balance AUS $: "+Bal);
	if(Bal<=2000)
		{
		try
			{
			UnionBank b=new  UnionBank();
			throw b;
			}
		catch(UnionBank b)
			{
			System.out.println("Please Maintance Sufficient Balance");
			}
		}
	else
		{
		System.out.println("You are Maintaining Sufficient Balance Thank You");
		}	
	System.out.println("\n"+"\n");
	}

public void Google_Acc()
	{
	System.out.println("WELCOME TO BANK OF QUEENSLAND GOOGLE PAY ONLINE");
	System.out.println("Custmer Name: "+name);
	System.out.println("UPI ID: "+Gupi);
	System.out.println("Avaiable Balance US $: "+Bal);
	if(Bal<=250)
		{
		try
			{
			UnionBank b=new  UnionBank();
			throw b;
			}
		catch(UnionBank b)
			{
			System.out.println("Please Maintance Sufficient Balance");
			}
		}
	else
		{
		System.out.println("You are Maintaining Sufficient Balance Thank You");
		}
	System.out.println("\n"+"\n");
	}

public void PhonePe_Acc()
	{
	System.out.println("WELCOME TO BENDIGO BANK OF AUSTRALIA PHONE PE ONLINE");
	System.out.println("Custmer Name: "+name);
	System.out.println("UPI ID: "+Pupi);
	System.out.println("Avaiable Balance UK $: "+Bal);
	if(Bal<=100)
		{
		try
			{
			UnionBank b=new  UnionBank();
			throw b;
			}
		catch(UnionBank b)
			{
			System.out.println("Please Maintance Sufficient Balance");
			}
		}
	else
		{
		System.out.println("You are Maintaining Sufficient Balance Thank You");
		}
	System.out.println("\n"+"\n");
	}


}

class Bank
{
public static void main(String[]args)
	{
	UPI  u=new UnionBank("VINEETH", "03301989126","UBIN09129", "HYDERABAD", 2000.00f);
	u.custmer_Acc();
	UPI  u1=new UnionBank("KATHERINE LANGFORD", "AUSS0929283","ASUT10823", "SYDDNI", 3500f);
	u1.online_Acc();
	UPI  u2=new UnionBank("JOCKER PODDYO","9836488762@upi", 150.00f);
	u2.Google_Acc();
	UPI  u3=new UnionBank(200.00f, "7893862826@upi", "HARRLY QULIN");
	u3.PhonePe_Acc();
	}
}
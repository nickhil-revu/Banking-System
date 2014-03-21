/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//package sta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Nickhil
 */
public class Sta 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException
    {   String ch,bal1,pin1;
        int bal,no=0,pin=0,amt,result;
        account acc=new account();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\n\n  Nickhil Revu                       A20299434  \n");
		System.out.println("  ***** CS 589:Software Testing Analysis *****  \n");
		System.out.println("\n\n\nPress Enter to continue.....");
		ch=br.readLine();
		
		System.out.println("");
        System.out.println("----------------Menu---------------");
        System.out.println("1.Open");
        System.out.println("2.Login");
        System.out.println("3.Pin");
        System.out.println("4.balance");
        System.out.println("5.Lock");
        System.out.println("6.Unlock");
        System.out.println("7.Withdraw");
        System.out.println("8.Deposit");
        System.out.println("9.Logout");
        System.out.println("10.exit");
		System.out.println("\n -----Test Oriented Methods-----");
        System.out.println("a.Show Balance");
        System.out.println("b.Current State");
		System.out.println("c.Show Pin");
		System.out.println("d.Show account Number");
		System.out.println("e.Show Number of Attempts left");
		System.out.println("f.Is locked");
		System.out.println("g.State");
        System.out.println("\nselect choice");
               
        ch=br.readLine();
        
        while(ch.compareTo("10")!=0)
        {
		try
			 {
            switch(ch)
            {
			 
                case "1":
                    System.out.println("Enter Opening Balance");
                    bal1=br.readLine();
                    bal=Integer.parseInt(bal1);
                    System.out.println("Enter Pin");
                    pin1=br.readLine();
                    pin=Integer.parseInt(pin1);
                    System.out.println("Enter Acoount Number");
                    no=Integer.parseInt(br.readLine());
                    result=acc.open(bal, pin, no);
					if(result==0)
					   System.out.println("\nAccount Opened Successfull");
					else
						System.out.println("\nAccess Denied!");
                    break;
					
                case"2":
                    System.out.println("Enter Account Number");
                    no=Integer.parseInt(br.readLine());
                    result=acc.login(no);
					if(result==0)
					   System.out.println("\nLogin Successfull");
					else
						System.out.println("\nAccess Denied!");
					break;
					
                case"3":
                    System.out.println("Enter pin");
                    pin=Integer.parseInt(br.readLine());
                    result=acc.pin(pin);
					if(result==0)
					   System.out.println("\nSuccessfull");
					else
						System.out.println("\nAccess Denied!");
                    break;
					
                case "4":
                    result=acc.balance();
					if(result!=-1)
					    System.out.println("Current Balanace :"+result);
					else
						System.out.println("\nAccess Denied!");
                    break;
					
                case "5":
                     System.out.println("Enter your Pin");
                     pin =Integer.parseInt(br.readLine());
                     result=acc.lock(pin);
					 if(result==0)
					   System.out.println("\nAccount Successfull Locked");
					else
						System.out.println("\nAccess Denied!");
                     break;
					 
                case "6":
                     System.out.println("Enter your Pin");
                     pin =Integer.parseInt(br.readLine());
                     result=acc.unlock(pin);
					 if(result==0)
					   System.out.println("\nAccount Successfull Unlocked");
					else
						System.out.println("\nAccess Denied!");
                     break;
					 
                case "7":
                     System.out.println("Enter Amount for Withdraw");
                     amt=Integer.parseInt(br.readLine());
                     result=acc.withdraw(amt);
					 if(result==0)
					   System.out.println("\nAmount Withdrawn Successfull");
					else
						System.out.println("\nAccess Denied!");
                     break;
					 
                case "8":
                     System.out.println("Enter Amount for Deposit");
                     amt=Integer.parseInt(br.readLine());
                     result=acc.deposit(amt);
					 if(result==0)
					   System.out.println("\nAmount Deposited Successfull");
					else
						System.out.println("\nAccess Denied!");
                     break;
					 
                case "9":
                     result=acc.logout();
					 if(result==0)
					   System.out.println("\nSuccessfully Logged out....See you Again.");
					else
						System.out.println("\nAccess Denied!");
					 
                     break;
					 
                case "10":
                     break;
					 
                case "a":
                     System.out.println("Balance : "+acc.show_balance());
                     break;
					 
                case "b":
                     System.out.println("Current State : "+acc.show_balance());
                     break;
					
				case "c":
					 System.out.println("Pin : "+acc.show_pin());
					 break;
					 
				case "d":
					 System.out.println("Account Number : "+acc.show_account());
					 break;
				
				case "e":
					 System.out.println("Attempts Left : "+acc.show_attempts());
					 break;
				
				case "f":
					 result=acc.is_locked();
					 if (result ==0) 
						System.out.println("Account is in not locked state");
					 else
						System .out.println("Account is  locked");
					 break;
					
				case "g":
					 System.out.println("Current State :");
					 acc.show_state();
					 break;
				

		}
		
    }catch(IOException | NumberFormatException | ArrayIndexOutOfBoundsException e)
					{
					System.out.println("\nERROR: Invalid Entry\n\n"+e);
					}
					
        System.out.println("\n\nPress Enter to continue...");
        ch=br.readLine();
        System.out.println("----------------Menu---------------");
        System.out.println("1.Open");
        System.out.println("2.Login");
        System.out.println("3.Pin");
        System.out.println("4.balance");
        System.out.println("5.Lock");
        System.out.println("6.Unlock");
        System.out.println("7.Withdraw");
        System.out.println("8.Deposit");
        System.out.println("9.Logout");
        System.out.println("10.exit");
        System.out.println("\n -----Test Oriented Methods-----");
        System.out.println("a.Show Balance");
        System.out.println("b.Current State");
		System.out.println("c.Show Pin");
		System.out.println("d.Show account Number");
		System.out.println("e.Show Number of Attempts left");
		System.out.println("f.Is locked");
		System.out.println("g.Current State");
        System.out.println("\nselect choice");      
        ch=br.readLine();
               
        }
        
    } 
	
}

class account
{
public account()
{
	x2 = 0;
	x4 = -1;
	x6 = 10;
	x7 = 1000;
	k = 0;
	num = 2;
}
public int open(int x, int y, int z)
{
	if ((x > 0) && (x4 == -1))
	{
		x1 = x;
		x3 = y;
		x5 = z;
		x4 = 0;
		return 0;
	}
	return -1;
}
public int deposit(int d)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x2 != 0)
	{
		return -1;
	}
	if ((x1 < x7) && (d>0))
	{
		x1 = x1 + d - x6;
		return 0;
	}
	else
	{
		if (d > 0)
		{
		x1 = x1 + d;
		return 0;
		}
	}
 return -1;
}
public int withdraw(int w)
{
if (x4 != 2)
{
	return -1;
}
if (x2 != 0)
{
	return -1;
}
if ((x1 > w) && (w > 0))
{
	if (x1 < x7)
	{
		return -1;
	}
	else
	{
		x1 = x1 - w;
	};
	if (x1 < x7)
	{
		x1 = x1 - x6;
	}
  return 0;
}
return -1;
}
public int balance()
{
	if (x4 != 2)
	{
		return -1;
	}
	return x1;
}
public int lock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x != x3)
	{
		return -1;
	}
	if (x2 == 0)
	{
		x2 = 1;
		return 0;
	}
	else
	{
		return -1;
	}
}
public int unlock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if ((x2 != 0) && (x == x3))
	{
		x2 = 0;
	return 0;
	}
	else
	{
		return -1;
	}
}
public int login(int x)
{
	if (x4 != 0)
	{
		return -1;
	}
	if (x5 == x)
	{
		x4 = 1;
		k = 0;
		return 0;
	}
	return -1;
}
public int logout()
{
	if ((x4 == 0) || (x2 == 1))
	{
		return -1;
	}
	x4 = 0;
	return 0;
}
public int pin(int x)
{
	if (x4 != 1)
	{
		return -1;
	}
	if (x == x3)
	{
		x4 = 2;
		return 0;
	}
	else
	{
		k++;
	}
	if (k >= num)
	{
		x4 = 0;
	}
	return -1;
}

/*Testing Oriented Methods*/
public int show_balance() 
{
	return x1;
}
public int show_pin()
{
	return x3;
}
public int show_account()
{
	return x5;
}
public int show_attempts()
{
	return (2-k);
}
public int is_locked()
{
	if (x2==0)
	   return 0;
	else
	    return -1;
}

public void show_state() // testing oriented method
{
    if((x2==1)&&(x4==2))
    {
        System.out.println("LOCKED STATE");
    }
    if((x4==0)&&(x2==0))
    {
        System.out.println("IDLE STATE");
    }
    if((x4==1)&&(x2==0)&&(k<num))
    {
        System.out.println("CHECKPIN STATE");
    }
    if((x4==2)&&(x1>999)&&(x2==0))
    {
        System.out.println("READY STATE");
    }
    if((x4==2)&&(x1<=999)&&(x2==0))
    {
        System.out.println("OVER DRAWN");
    }
    if(x4==-1)
    {
        System.out.println("START STATE");
    }
  
}

/*End of Testing Oriented Methods*/
	private int x1; //balance
	private int x2;
	private int x3; //pin #
	private int x4;
	private int x5; // account #
	private int x6; // penalty
	private int x7; // minimum balance
	private int k;
	private int num; //maximum # of attempts with incorrect pin
}

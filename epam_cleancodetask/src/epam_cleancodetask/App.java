package epam_cleancodetask;
import java.util.*;

import java.io.*;


class interest
{
	Scanner scan=new Scanner(System.in);
    float principal_amount,rate_of_interest,time,n,simple_interest;
	double compund_interest,amount;


	void calculate_interest()throws IOException
	{

		System.out.write("\n \n \t ******************* CALCULATE SIMPLE & COMPOUND INTEREST *****************************\n \n ".getBytes());


		System.out.write("\n ENTER THE PRINCIPAL AMOUNT : ".getBytes());
		principal_amount=scan.nextFloat();

		System.out.write("\n ENTER THE RATE OF INTEREST : ".getBytes());
		rate_of_interest=scan.nextFloat();


		System.out.write("\n ENTER THE TIME PERIODE (IN-YEARS) : ".getBytes());
		time=scan.nextFloat();


		simple_interest=(principal_amount*rate_of_interest*time)/100;

		System.out.format("%s%.3f","\n THE SIMPLE INTEREST AMOUNT IS RS: ",simple_interest);



		amount=(principal_amount)* Math.pow( ( 1+ (rate_of_interest/100) ),time);

		compund_interest=amount-(principal_amount);

		System.out.format("%s%.3f","\n\n THE COMPUND  INTEREST AMOUNT IS RS: ",compund_interest);


		System.out.format(" \n \n --------------------------------------------------------------------------------");




	}



}



class construction 
{
	Scanner scan=new Scanner(System.in);

	int choice;
	float area,cost=0;



	void  calculate_cost()throws IOException
	{
		System.out.write("\n \n \t ******************* ESTIMATE HOUSE CONSTRUCTION COST  *****************************\n \n ".getBytes());

		System.out.write("\n 1. STANDARD-MATERIAL \n 2. ABOVE STANDARD-MATERIAL \n 3. HIGH STANDARD-MATERIAL \n 4. HIGH STANDARD-MATERIAL AND FULLY AUTOMATED HOME  \n".getBytes());
		System.out.write("=================================================================================================\n \n ".getBytes());


		System.out.write("\n ENTER TOTAL AREA OF THE HOUSE (square feet) : ".getBytes());
		area = scan.nextFloat();



		System.out.write("\n ENTER YOUR CHOICE FOR MATERIAL STANDARD : ".getBytes());
		choice = scan.nextInt();



		switch(choice)
		{


		case 1:  cost= area*1200;
		display();
		break;

		case 2:  cost= area*1500;
		display();
		break;

		case 3:  cost= area*1800;
		display();
		break;

		case 4:  cost= area*2500;
		display();
		break;

		default :  System.out.format("\n WRONG CHOICE PLEASE RE-ENTER YOUR CHOICE !!!!! ");
		break;



		}



		System.out.format(" \n \n --------------------------------------------------------------------------------");



	}


	void display()
	{

		System.out.format(" \n THE ESTIMATED  HOUSE CONSTRUCTION COST IS  : %.2f INR",cost);

	}





}



public class App
{
	public void main( String[] args )throws IOException
	{
		Scanner scan=new Scanner(System.in);

		int ch;

		System.out.write("\n \t \t \t**************** EPAM PROJECT ***************** \n ".getBytes());

		while (true)

		{  
			System.out.write("\n \n 1. CALCULATE SIMPLE AND COMPOUND INTEREST \n 2. ESTIMATE HOUSE CONSTRUCTION COST  \n 3. EXIT \n ".getBytes());

			System.out.write("=====================================================================================\n \n ".getBytes());

			System.out.write("\n ENTER YOUR CHOICE  : ".getBytes());

			ch = scan.nextInt();



			switch(ch)
			{


			case 1:	    interest one=new interest();
			one.calculate_interest();
			break;



			case 2: 	   construction two =new construction();
			two.calculate_cost();
			break;


			case 3:   System.out.format("\n \t !!!! THANK YOU  !!!!! \t \n  ");
			break;


			default :  System.out.format("\n WRONG CHOICE PLEASE RE-ENTER YOUR CHOICE !!!!! ");
			break;


			}


			if (ch==3)
			{
				scan.close();
				break;
			}



		}

	}
}


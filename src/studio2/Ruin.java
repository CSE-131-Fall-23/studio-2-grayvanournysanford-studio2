package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter win chance (from 0.00 to 1.00): ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		System.out.println("Number of days to simulate: ");
		int totalSimulations = in.nextInt();
		System.out.println("Starting Amount: ");
		int startAmount = in.nextInt();
		for (int simDay=1; simDay<totalSimulations; simDay++)
		{
			int simRound = 0;
			while (startAmount < winLimit && startAmount>0)
			{
				double roll = Math.random();
				if (roll<=winChance) 
				{
					startAmount++;
				}
				else
				{
					startAmount--;
				}
				simRound++;
			}
			if (startAmount==0)
			{
				System.out.println("Simulation: "+simDay+". Rounds: " + simRound + ". You Ruin");
			}
			if (startAmount==winLimit)
			{
				System.out.println("Simulation: " + simDay + ". Rounds: " + simRound + ". You Win");
			}
		}

	}

}

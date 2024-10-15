package org.hand.games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		String[]choices= {"Rock","Paper","Scissors"};
		
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.println("Enter Your Choice (Rock,Paper,Scissors)");
		String userchoice = s.nextLine();
		
		userchoice = userchoice.trim().toLowerCase();
		if(!userchoice.equals("rock")&& !userchoice.equals("paper")&& !userchoice.equals("scissors")) {
			System.out.println("Invalid Choice,Please Select anyone from Rock,Paper,Scissors");
			return;
		}
		int computerchoiceIndex=r.nextInt(3);
		String computerchoice=choices[computerchoiceIndex];
		
		System.out.println("Computer Choice is:" +computerchoice);
		
		if(userchoice.equals(computerchoice.toLowerCase())) {
		System.out.println("It is a tie");
		}
		else if((userchoice.equals("Rock")&& computerchoice.equals("Scissors"))||
				(userchoice.equals("Paper")&& computerchoice.equals("Stone"))||
				(userchoice.equals("Scissors")&& computerchoice.equals("Paper")))
		{
			System.out.println("You Win");
		}
		else {
			System.out.println("Computer Wins");
		}
		s.close();
		}
		
	}
	


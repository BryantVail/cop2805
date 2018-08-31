package footballScoresExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the score of two teams from 5 games");

		FootballGame[] games = new FootballGame[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("please enter the winning team name for game number " + (i + 1) + ".");
			String winningTeam = input.nextLine();
			System.out.println("please enter the losing team name for game number " + (i + 1) + ".");
			String losingTeam = input.nextLine();

			// add total to the 'i'th place of the array as a total
			games[i] = new FootballGame();
			games[i].winningTeam = winningTeam;
			games[i].losingTeam = losingTeam;
		} // end for

		for (int i = 0; i < games.length; i++) {
			System.out.println("The Winning Team for game number: " + i + " is: " + games[i].winningTeam);
		}

		//

	}// end public static void main(String[] args)

}// end class Main

class FootballGame {
	public String winningTeam;
	public String losingTeam;
}

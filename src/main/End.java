package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class End {

	public static final String FILENAME = "data/nwslStats.csv";

	public static List<SoccerTeam> load() {

		// list has been created for you to hold the teams
		List<SoccerTeam> teams = new ArrayList<>();

		Scanner s = null;
		try {
			s = new Scanner(new File(FILENAME));
		}
		catch(FileNotFoundException e){
			throw new RuntimeException();
		}
			// TODO change true to something else
			while (true) {
				// TODO: get the next line from the scanner and split it by commas (",")
				// save the name, wins, draws, and losses to the following variables.
				// TODO edit right hand sides of equal signs!
				String name = null;
				int wins = 0;
				int draws = 0;
				int losses = 0;

				// created a team and added elements to the list.
				// Done for you
				teams.add(new SoccerTeam(name, wins, draws, losses));
			}
			// TODO: once you fix the while loop, un-comment-out the following line.
			// s.close();
		

		return teams;
	}
	public static String junitMethod(){
		List<SoccerTeam> teams = load();
		String s = "2023 NWSL Stats\n";
		s += "Team Name: W/D/L\n";
		for (SoccerTeam t : teams) {
			s+= t+"\n";
		}
		return s;
	}

	public static void main(String[] args) {
		List<SoccerTeam> teams = load();
		System.out.println("2023 NWSL Stats");
		System.out.println("Team Name: W/D/L");
		for (SoccerTeam t : teams) {
			System.out.println(t);
		}

	}

}

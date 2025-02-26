package main;

public class SoccerTeam {
	String name;
	int wins;
	int draws;
	int losses;

	public SoccerTeam(String name, int wins, int draws, int losses) {
		this.name = name;
		this.wins = wins;
		this.draws = draws;
		this.losses = losses;
	}

	public String getName() {
		return name;
	}

	public int getWins() {
		return wins;
	}

	public int getDraws() {
		return draws;
	}

	public int getLosses() {
		return losses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public String toString(){
		return this.name + ": " + this.wins + "/" + this.draws + "/" + this.losses;
	}

}

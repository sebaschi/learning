package generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team <T>> {

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already on the Team " + this.name);
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		String message;
		if(ourScore > theirScore) {
			won++;
			message = " beat ";
		} else if( ourScore == theirScore) {
			tied++;
			message = " drew with ";
		} else {
			lost++;
			message = " lost to ";
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}
	
	public void printRanking() {
		System.out.println(this.getName() + ": " + this.ranking());
	}
	
	public void printCompareTo(Team<T> team) {
		System.out.println("The score between " + this.getName() + " and " + team.getName() + " is " + this.compareTo(team));
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking()>team.ranking()) {
			return -1;
		} else if(this.ranking()<team.ranking()) {
			return 1;
		} else {
			return 0;
		}
	}
}

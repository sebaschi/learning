package generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<?>> {

	private String name;
	ArrayList<Team<?>> teams = new ArrayList<>();
	
	public League(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean addTeam(T team) {
		if(teams.contains(team)) {
			return false;
		}
		teams.add(team);
		return true;
	}
	
	public void printBoard() {
		Collections.sort(teams);
		for(Team<?> team : teams) {
			System.out.println(team.getName() + ": " + team.ranking() + " ");
	}
}
}
package generics;

public class Main {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> fcz = new Team<>("FcZ");
		fcz.addPlayer(joe);
//		fcz.addPlayer(pat);
//		fcz.addPlayer(beckham);
		
		System.out.println(fcz.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chiggs");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenstring = new Team<>("this wont work");
		brokenstring.addPlayer(beckham);
		
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		melbourne.addPlayer(banks);
		
		Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		
		hawthorne.matchResult(fremantle, 1, 0);
		hawthorne.matchResult(fcz, 3, 8);
		
		fcz.matchResult(fremantle, 2, 1);
//		fcz.matchResult(baseballTeam, 1, 1);
		System.out.println("Ranking");
		fcz.printRanking();
		melbourne.printRanking();
		fremantle.printRanking();
		hawthorne.printRanking();
		fcz.printCompareTo(melbourne);
		fcz.printCompareTo(hawthorne);
		hawthorne.printCompareTo(fcz);
		melbourne.printCompareTo(fremantle);

	}

}

package tr.org.linux.kamp.BallGame;

public class FootballApp {
	public static void main(String[] args) {
		FootballRules rules = new FootballRules();
		FootballClub gs = new FootballClub();
		FootballClub fb = new FootballClub();
		rules.setAsGuestTeam(gs);
		rules.setAsHomeTeam(fb);

		gs.setClubName("Galatasaray");
		fb.setClubName("Fenerbahçe");

		rules.anOpponentScores(gs);
		rules.anOpponentScores(fb);
		rules.anOpponentScores(gs);

		rules.endOfFirstHalf();
		rules.endofTheGame();
		
		System.out.println(gs);

	}
}

package tr.org.linux.kamp.BallGame;

public class FootballRules extends Football {
	private int scoresOfHomeTeam;
	private int scoresOfGuestTeam;
	FootballClub homeTeam;
	FootballClub guestTeam;

	public void setAsHomeTeam(FootballClub club) {
		homeTeam = club;
	}

	public void setAsGuestTeam(FootballClub club) {
		guestTeam = club;
	}

	public void endOfFirstHalf() {
		System.out.println("ilk yarı bitti " + hasWinner() + " Önde !");
	}

	public void endofTheGame() {
		System.out.println("Oyun Bitti " + hasWinner() + " Kazandı !");
	}

	@Override
	public boolean hasOppenent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void moveTheBall(FootballClub club) {
		System.out.println(club.getClubName() + " Topu sürüyor");

	}

	@Override
	void anOpponentScores(FootballClub club) {
		if (club.equals(homeTeam)) {
			scoresOfHomeTeam++;
			System.out.println(club.getClubName() + " Attı skoru : " + scoresOfHomeTeam);
		} else if (club.equals(guestTeam)) {
			scoresOfGuestTeam++;
			System.out.println(club.getClubName() + " Attı Skoru : " + scoresOfGuestTeam);
		} else {
			System.out.println("Geçersiz Takım");
		}

	}

	public int getScoresOfHomeTeam() {
		return scoresOfHomeTeam;
	}

	public void setScoresOfHomeTeam(int scoresOfHomeTeam) {
		this.scoresOfHomeTeam = scoresOfHomeTeam;
	}

	public int getScoresOfGuestTeam() {
		return scoresOfGuestTeam;
	}

	public void setScoresOfGuestTeam(int scoresOfGuestTeam) {
		this.scoresOfGuestTeam = scoresOfGuestTeam;
	}

	@Override
	String hasWinner() {
		if (scoresOfGuestTeam < scoresOfHomeTeam) {
			return homeTeam.getClubName();
		} else if (scoresOfGuestTeam > scoresOfHomeTeam) {
			return guestTeam.getClubName();
		} else {
			return "berabere";
		}

	}

}

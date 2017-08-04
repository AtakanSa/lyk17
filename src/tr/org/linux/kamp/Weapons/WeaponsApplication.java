package tr.org.linux.kamp.Weapons;

public class WeaponsApplication {

	public static void main(String[] args) {
		Sword sword = new Sword(600, 2, false, 600);
		
		Sword sword2 = new Sword(200, 2, false, 200);
		Armor chain = new Armor(500, 200, false,500);
		Armor chain2 = new Armor(500, 200, false,500);
		Armor chain3 = new Armor(500, 200, false,500);

		chain.setWorn(true);
		// chain.setUseItem(true);
		chain.setDefencePoint(550);
		chain.getHit(sword);
		System.out.println(chain.getItemQuantity());
		System.out.println(sword.getItemQuantity());
		
	}
}

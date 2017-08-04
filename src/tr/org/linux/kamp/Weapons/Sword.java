package tr.org.linux.kamp.Weapons;

public class Sword extends Weapon {

	public Sword(int itemPrice, int itemWeight, boolean useItem, int damageAmount) {
		super(itemPrice, itemWeight, useItem, damageAmount);
		setItemQuantity(getItemQuantity()+1);
		// TODO Auto-generated constructor stub
	}

	

}

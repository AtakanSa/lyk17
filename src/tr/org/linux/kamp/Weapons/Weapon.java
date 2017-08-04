package tr.org.linux.kamp.Weapons;

public abstract class Weapon extends Item {

	private int damageAmount;

	public int getDamageAmount() {
		return damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}

	public Weapon(int itemPrice, int itemWeight, boolean useItem, int damageAmount) {
		super(itemPrice, itemWeight, useItem);
		setItemQuantity(getItemQuantity() + 1);
		this.damageAmount = damageAmount;
	}

}

package tr.org.linux.kamp.Weapons;

public class Armor extends Item implements Upgradeable {

	private int defencePoint;

	public int getDefencePoint() {
		return defencePoint;
	}

	public void setDefencePoint(int defencePoint) {
		this.defencePoint = defencePoint;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public void setWorn(boolean isWorn) {
		this.isWorn = isWorn;
	}

	private boolean isWorn;

	public Armor(int itemPrice, int itemWeight, boolean useItem, int defencePoint) {
		super(itemPrice, itemWeight, useItem);
		setItemQuantity(getItemQuantity() + 1);
		this.defencePoint = defencePoint;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void upgrade() {
		defencePoint += 10;

	}

	@Override
	public void setUseItem(boolean useItem) {
		isWorn = useItem;
	}

	public void getHit(Weapon wpn) {
		if (isWorn) {
			if (defencePoint > wpn.getDamageAmount()) {
				defencePoint -= wpn.getDamageAmount();
				System.out.println("Armourun zırhı daha fazla , Yeni Armor :" + defencePoint);
			} else {
				defencePoint = 0;
				System.out.println("Weaponun Damagesi daha fazla yeni Armor Değeri : " + defencePoint);
				isWorn = false;
			}
		} else {
			System.out.println("First Equip Armor");

		}
	}

}

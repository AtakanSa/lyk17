package tr.org.linux.kamp.Weapons;

public class Bow extends Weapon implements Upgradeable {

	private int numOfArrows;

	public Bow(int itemPrice, int itemWeight, boolean useItem, int damageAmount,int NumOfArrows) {
		super(itemPrice, itemWeight, useItem, damageAmount);
		this.numOfArrows = numOfArrows;
		setItemQuantity(getItemQuantity()+1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void upgrade() {
		numOfArrows += 10;
		//numOfArrows = numOfArrows +10;

	}
	
	public void useItem() {
		if (numOfArrows > 0) {
			setUseItem(true);
			System.out.println("Bow giyildi");
		} else {
			System.out.println("Out of Arrow !");
		}
	}

}

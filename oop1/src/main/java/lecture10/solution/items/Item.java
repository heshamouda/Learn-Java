package lecture10.solution.items;

public abstract class Item {
	private double prize;

	public Item(double p) {
		prize = Math.ceil(p*100)/100;
	}

	public double getPrize() {
		return prize;
	}

	public abstract void getInfo();
}

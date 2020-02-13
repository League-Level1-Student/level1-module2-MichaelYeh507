package _04_tea_maker;

public class tea_maker_runner {
	public static void main(String[] args) {
		TeaBag teaBag = new TeaBag(TeaBag.MINT);
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		kettle.getWater();
		kettle.boil();
		cup.makeTea(teaBag, kettle.getWater());
	}
}

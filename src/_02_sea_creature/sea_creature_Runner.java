package _02_sea_creature;

public class sea_creature_Runner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		patrick.getName();
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("Squidward");
		squidward.getName();
		squidward.eat();
		squidward.laugh();
	}
}

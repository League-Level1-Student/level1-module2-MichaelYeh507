package _03_smurf;

public class smurf_Runner {
	public static void main(String[] args) {
		Smurf smurfy = new Smurf("Smurfy");
		smurfy.getName();
		smurfy.eat();
		Smurf papaSmurf = new Smurf("Papa Smurf");
		papaSmurf.getName();
		System.out.println("Papa smurf wears " + papaSmurf.getHatColor("Papa Smurf") + " hats.");
		System.out.println("He/she is a " + papaSmurf.isGirlOrBoy("Papa Smurf"));
		
		Smurf smurfette = new Smurf("Papa Smurf");
		smurfette.getName();
		System.out.println("Smurfette wears " + smurfette.getHatColor("Smurfette") + " hats.");
		System.out.println("He/she is a " + smurfette.isGirlOrBoy("Smurfette"));
	}
}

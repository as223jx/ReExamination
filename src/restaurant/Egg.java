package restaurant;

public class Egg {
	
	boolean cooked = false;
	boolean scrambled = false;
	boolean boiled = false;
	
	public Egg() {
		
	}
	
	public void scramble() {
		if(!cooked) {
			cooked = true;
			scrambled = true;
		}
	}
	
	public void boil() {
		if(!cooked) {
			cooked = true;
			boiled = true;
		}
		else throw new IllegalStateException("Egg has already been cooked!");
	}
}
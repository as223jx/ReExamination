package restaurant;

public class Egg {
	
	boolean cooked = false;
	boolean scrambled = false;
	boolean boiled = true;
	
	public Egg() {
		
	}
	
	public void scramble() {
		if(!cooked) {
			cooked = true;
			scrambled = true;
		}
	}
	
	public void boil() {
		cooked = true;
	}
}
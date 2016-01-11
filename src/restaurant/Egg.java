package restaurant;

public class Egg {
	
	boolean cooked = false;
	boolean scrambled = false;
	
	public Egg() {
		
	}
	
	public void scramble() {
		if(!cooked) {
			cooked = true;
			scrambled = true;
		}
	}
}
public class SquirrelPlay {

	public boolean squirrelPlay(int temp, boolean isSummer) {
	
		return temp >= 60 && ((isSummer && temp <= 100) || (!isSummer && temp <= 90));
	
	}

}

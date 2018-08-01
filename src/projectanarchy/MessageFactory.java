package projectanarchy;

public class MessageFactory {
	public static String sendHitMiss(int[] target) {
		int shipLocation = 0;
		if (target[0] == shipLocation) {
			return "hit";
		}
		return "miss";
	}
	
	public void sendMove() {
		//
	}
	
	public void sendStart() {
		//
	}
	
	public void sendWin() {
		//
	}
}

package projectanarchy;

import java.io.StringWriter;

import org.json.JSONWriter;

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
	
	public static String login(String username, String password) {
		StringWriter stringWriter = new StringWriter();
		JSONWriter writer = new JSONWriter(stringWriter);
		writer.object();
		writer.key("type").value("login");
		writer.key("message");
		writer.object();
		writer.key("username").value(username);
		writer.key("password").value(password);
		writer.endObject();
		writer.endObject();
		return stringWriter.toString();
	}
}
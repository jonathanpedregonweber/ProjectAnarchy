package projectanarchy;

import java.io.StringWriter;
import java.util.function.Consumer;

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
	
	private static String json(Consumer<JSONWriter> consumer) {
		StringWriter stringWriter = new StringWriter();
		JSONWriter writer = new JSONWriter(stringWriter);
		writer.object();
		consumer.accept(writer);
		writer.endObject();
		return stringWriter.toString();
	}
	
	
	public static String chat(String message) {
		return json(writer -> {
			writer.key("type").value("chat");
			writer.key("message").value(message);
		});
	}
	
	public static String chat(String message, String username) {
		return json(writer -> {
			writer.key("type").value("chat");
			writer.key("message").value(message);
			writer.key("username").value(username);
		});
	}
	public static String login(String username, String password) {
		return json(writer -> {
			writer.key("type").value("login");
			writer.key("message");
			writer.object();
			writer.key("username").value(username);
			writer.key("password").value(password);
			writer.endObject();
		});
	}
}
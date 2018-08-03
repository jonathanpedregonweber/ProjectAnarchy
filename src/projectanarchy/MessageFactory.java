package projectanarchy;

import java.io.StringWriter;
import java.util.function.Consumer;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONWriter;

public class MessageFactory {
	final private static String module = "Battleship2"; // Not sure if this is correct.
	
	public static String sendHitMiss(int[] target) {
		int shipLocation = 0;
		if (target[0] == shipLocation) {
			return application("hit");
		}
		return application("miss");
	}
	
	public static String sendMove() {
		return application("move");
	}
	
	public static String sendStart() {
		return application("start");
	}
	
	public static String sendWin() {
		return application("win");
	}
	
	private static String json(String type, Consumer<JSONWriter> message) {
		StringWriter stringWriter = new StringWriter();
		JSONWriter writer = new JSONWriter(stringWriter);
		writer.object();
		writer.key("type").value(type);
		writer.key("message");
		message.accept(writer);
		writer.endObject();
		return stringWriter.toString();
	}
	
	private static String application(String action) {
		return json("application", writer -> {
			writer.object();
			writer.key("module").value(module);
			writer.key("action").value(action);
			writer.endObject();
		});
	}
	
	public static String chat(String message) {
		return json("chat", writer -> {
			writer.value(message);
		});
	}
	
	public static String chat(String message, String username) {
		return json("chat", writer -> {
			writer.value(message);
			writer.key("username").value(username);
		});
	}
	
	public static String login(String username, String password) {
		return json("login", writer -> {
			writer.object();
			writer.key("username").value(username);
			writer.key("password").value(password);
			writer.endObject();
		});
	}
	
	public static MessageChat getChat(String json) {
		JSONTokener tokener = new JSONTokener(json);
		JSONObject object = new  JSONObject(tokener);
		return new MessageChat(object);
	}

	public static String setChat(MessageChat chat) {
		return json("chat", writer -> {
			writer.value(chat.getMessage());
			writer.key("username");
			writer.value(chat.getUsername());
		});
	}
}
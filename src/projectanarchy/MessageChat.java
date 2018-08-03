package projectanarchy;

import org.json.JSONObject;

public class MessageChat extends Message {
	private String message;
	private String username;
	
	public MessageChat(String message, String username) {
		this.message = message;
		this.username = username;
	}
	
	public MessageChat(JSONObject object) {
		setMessage(object);
		setMessage(object);
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(JSONObject object) {
		this.message = parse(object, "message");
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(JSONObject object) {
		this.username = parse(object, "username");
	}
}
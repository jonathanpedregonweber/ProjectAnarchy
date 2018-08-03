package projectanarchy;

import org.json.JSONObject;

import projectanarchy.models.MessageType;

public class MessageChat extends Message
{
	private String message;
	private String username;
	
	public MessageChat(String message, String username)
	{
		super(MessageType.Chat);
		this.message = message;
		this.username = username;
	}
	
	public MessageChat(JSONObject object)
	{
		super(MessageType.Chat);
		setMessage(object);
		setMessage(object);
	}
	
	public String getMessage()
	{
		return this.message;
	}
	
	public void setMessage(JSONObject object)
	{
		this.message = parse(object, "message");
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(JSONObject object)
	{
		this.username = parse(object, "username");
	}
}
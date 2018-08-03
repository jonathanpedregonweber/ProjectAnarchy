package projectanarchy;

import org.json.JSONObject;

public class Message {
    public MessageType Type;

    public Message(MessageType type)
    {
        Type = type;
    }
	protected static String parse(JSONObject object, String key) {
		String value = "";
		try {
			value = object.getString(key);
		}		catch (org.json.JSONException exception) {
			System.out.println(exception.getMessage());
		}
		return value;
	}
}
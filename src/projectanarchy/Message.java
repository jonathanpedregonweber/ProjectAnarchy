package projectanarchy;

import org.json.JSONObject;

public class Message {
	protected static String parse(JSONObject object, String key) {
		String value = "";
		try {
			value = object.getString(key);
		}
		catch (org.json.JSONException exception) {
			System.out.println(exception.getMessage());
		}
		return value;
	}
}
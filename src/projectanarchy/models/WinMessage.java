package projectanarchy.models;

import projectanarchy.Message;

public class WinMessage extends Message
{
	private boolean Win;
	
	public WinMessage(boolean win)
	{
		super(MessageType.Win);
		this.setWin(win);
	}

	public boolean isWin()
	{
		return this.Win;
	}

	public void setWin(boolean win)
	{
		this.Win = win;
	}
}
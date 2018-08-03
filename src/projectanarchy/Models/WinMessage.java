public class WinMessage extends Message
{
    private boolean Win;

    public WinMessage(boolean win)
    {
        super(MessageType.Win);
        Win = win;
    }
}
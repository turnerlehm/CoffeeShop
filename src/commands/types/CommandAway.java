package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandAway extends AbstractType implements Type
{
    public CommandAway()
    {
        super(CommandType.AWAY);
        allowed = new FlagType[]{FlagType.MESSAGE};
    }

    public String help()
    {
        return "Syntax: /away --msg=\"<message\"\n" +
                "If a message <message> is given, marks you as being away, otherwise removes your away status and the previous message\n" +
                "<message> must be enclosed in quotations as it may contain spaces\n";
    }
}

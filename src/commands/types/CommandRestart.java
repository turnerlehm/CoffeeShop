package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandRestart extends AbstractType implements Type
{
    public CommandRestart()
    {
        super(CommandType.RESTART);
        allowed = new FlagType[]{FlagType.PASSWORD};
    }

    public String help()
    {
        return "Syntax: /restart --pwd=<password>\n" +
                "If you are an admin and specify the correct password, this command restarts the local server\n";
    }
}

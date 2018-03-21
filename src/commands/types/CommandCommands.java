package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandCommands extends AbstractType implements Type
{
    public CommandCommands()
    {
        super(CommandType.COMMANDS);
        allowed = new FlagType[]{FlagType.NONE};
    }

    public String help()
    {
        return "Syntax: /commands\n" +
                "Lists all currently available commands\n";
    }
}

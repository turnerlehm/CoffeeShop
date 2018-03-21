package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandUserhost extends AbstractType implements Type
{
    public CommandUserhost()
    {
        super(CommandType.UHOST);
        allowed = new FlagType[]{FlagType.NICK};
    }

    public String help()
    {
        return "Syntax: /userhost --nick=<nickname>\n" +
                "Returns the hostname and nickname of a user\n" +
                "<nickname> may not contain spaces or the @ symbol\n";
    }
}

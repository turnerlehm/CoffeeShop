package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandKill extends AbstractType implements Type
{
    public CommandKill()
    {
        super(CommandType.KILL);
        allowed = new FlagType[]{FlagType.NICK, FlagType.REASON};
    }

    public String help()
    {
        return "Syntax: /kill --nick=<nickname>[,<nicknames>] --reason=\"<reason>\"\n" +
                "Disconnects the given user(s) specified by <nickname> for the given <reason>\n" +
                "Multiple <nicknames> must be comma separated\n" +
                "<nickname>/<nicknames> must not contain spaces or the @ symbol\n" +
                "<reason> must be contained in quotations as it may contain spaces\n";
    }
}

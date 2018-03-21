package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandMode extends AbstractType implements Type
{
    public CommandMode()
    {
        super(CommandType.MODE);
        allowed = new FlagType[]{FlagType.TARGET, FlagType.MODE};
    }

    @Override
    public String help() {
        return "Syntax: /mode --target=<target> --mode=<+|-><mode>[,<+|-><modes>]\n"+
                "Sets the mode for a channel or nickname specified in <target>\n"+
                "A user may only set modes for themselves and may not set the +MOD or +ADMIN modes\n"+
                "A user may only change modes for channels where they are at least a moderator\n"+
                "+ adds the specified <mode> to the <target>, - removes the specified <mode> if set\n";
    }
}

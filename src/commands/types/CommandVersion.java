package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandVersion extends AbstractType implements Type
{

    public CommandVersion()
    {
        super(CommandType.VER);
        allowed = new FlagType[]{FlagType.SERVERMASK};
    }

    @Override
    public String help() {
        return "Syntax: /version [--server=<servermask>]\n"+
                "Returns the current version of the server/client named by <servermask>\n"+
                "<servermask> may not contain spaces\n";
    }
}

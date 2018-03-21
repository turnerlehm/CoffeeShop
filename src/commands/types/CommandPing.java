package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandPing extends AbstractType implements Type
{

    public CommandPing()
    {
        super(CommandType.PING);
        allowed = new FlagType[]{FlagType.SERVER};
    }

    @Override
    public String help() {
        return "Syntax: /ping --server=<server>\n"+
                "Pings the server named by <server> and waits for a corresponding PONG response\n"+
                "Useful for checking if a server is up or not\n"+
                "<server> may not contain spaces\n";
    }
}

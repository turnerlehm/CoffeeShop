package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandPong extends AbstractType implements Type
{

    public CommandPong()
    {
        super(CommandType.PONG);
        allowed = new FlagType[]{FlagType.SERVER};
    }

    @Override
    public String help() {
        return "Syntax: /pong --server=<server>\n"+
                "The response to PING messages, automatically issued by the client in response to server PINGS\n"+
                "<server> must not contain spaces\n"+
                "This command should not be issued manually\n";
    }
}

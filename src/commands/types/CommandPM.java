package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandPM extends AbstractType implements Type
{

    public CommandPM()
    {
        super(CommandType.PM);
        allowed = new FlagType[]{FlagType.TARGET, FlagType.TEXT};
    }

    @Override
    public String help() {
        return "Syntax: /pm --target=<target>[,<targets>] --msg=\"<message>\"\n"+
                "Sends a private message to the user(s) or channel(s) specified in <target>\n"+
                "You must specify at least one <target>, multiple <targets> must be comma separated\n"+
                "You may not send messages to channels operating in PRIVATE mode unless you are a member of those channels\n"+
                "<message> must be contained in quotations since it may contain spaces\n";
    }
}

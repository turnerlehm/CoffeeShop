package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandNotice extends AbstractType implements Type
{
    public CommandNotice()
    {
        super(CommandType.NOTICE);
        allowed = new FlagType[]{FlagType.TARGET, FlagType.TEXT};
    }

    @Override
    public String help() {
        return "Syntax: /notice --target=<target>[,<targets>] --msg=\"<message>\"\n"+
                "Sends a notice to the user(s) or channel(s) specified in <target>\n"+
                "You must specify at least one <target>, multiple targets must be comma separated\n"+
                "You may not send notices to channels operating in PRIVATE mode that you are not a member of\n"+
                "<message> must be contained in quotations as it may contain spaces\n";
    }
}

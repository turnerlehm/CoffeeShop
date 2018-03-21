package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandOper extends AbstractType implements Type
{
    public CommandOper()
    {
        super(CommandType.OPER);
        allowed = new FlagType[]{FlagType.LOGIN, FlagType.PASSWORD};
    }

    @Override
    public String help() {
        return "Syntax: /oper --login=<login> --pwd=<password>\n"+
                "Attempts to authenticate a user specified by <login> as a channel administrator\n"+
                "Both successful and unsuccessful attempts are logged and sent to online channel administrators\n";
    }
}

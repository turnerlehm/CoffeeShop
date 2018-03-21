package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandGline extends AbstractType implements Type
{
    public CommandGline()
    {
        super(CommandType.GLINE);
        allowed = new FlagType[]{FlagType.HOST, FlagType.DURATION, FlagType.REASON};
    }

    public String help()
    {
        return "Syntax: /gline --host=<hostname> --duration=<duration_string> --reason=\"<reason>\"\n" +
                "Sets or removes a g-line (global host based ban). You must specify at least 3 parameters to add a ban, and one parameter to remove a ban (just the <hostname> section.\n" +
                "The duration is specified in the following format: 1y2w3d4h5m6s meaning one year, two weeks, three days, 4 hours, 5 minutes and 6 seconds\n" +
                "<hostname> must not contain spaces or the @ symbol\n" +
                "<duration_string> must not contain spaces\n" +
                "<reason> must be contain in quotations as it may contain spaces\n";
    }
}

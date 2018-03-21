package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandEline extends AbstractType implements Type
{
    public CommandEline()
    {
        super(CommandType.ELINE);
        allowed = new FlagType[]{FlagType.HOST, FlagType.DURATION, FlagType.REASON};
    }

    public String help()
    {
        return "Syntax: /eline --host=<hostname> --duration=<duration_string> --reason=\"<reason>\"\n" +
                "Sets or removes an e-line (local ban exception) on the specified hostname\n" +
                "You must specify at least 3 parameters to add an exception, and one parameter to remove an exception (just the <hostname> section)\n" +
                "The <duration_string> is formatted as follows: 1y2w3d4h5m6s meaning one year, two weeks, three days, 4 hours, 5 minutes and 6 seconds\n" +
                "<hostname> must not contain spaces or the @ symbol\n" +
                "<duration_string> must not contain spaces\n" +
                "<reason> must be contained in quotations as it may contain spaces\n";
    }
}

package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandQline extends AbstractType implements Type
{
    public CommandQline()
    {
        super(CommandType.QLINE);
        allowed = new FlagType[]{FlagType.NICK, FlagType.DURATION, FlagType.REASON};
    }

    public String help()
    {
        return "Syntax: /qline --nick=<nickname> --duration=<duration_string> --reason=\"<reason>\"\n" +
                "Sets or removes a q-line (global nickname based ban) on a given <nickname>\n" +
                "You must specify at least 3 parameters to add a ban, and one parameter to remove a ban (just the <nickname> portion)\n" +
                "The duration is specified in the following format: 1y2w3d4h5m6s meaning one year, two weeks, three days, 4 hours, 5 minutes and 6 seconds\n" +
                "<nickname> must not contain spaces or the @ symbol\n" +
                "duration_string> must not contain spaces\n" +
                "<reason> must be enclosed in quotations as it may contain spaces\n";
    }
}

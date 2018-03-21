package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandZline extends AbstractType implements Type
{
    public CommandZline()
    {
        super(CommandType.ZLINE);
        allowed = new FlagType[]{FlagType.IP, FlagType.DURATION, FlagType.REASON};
    }

    public String help()
    {
        return "Syntax: /zline --ip=<ip_addr> --duration=<duration_string> --reason=\"<reason>\"\n" +
                "Sets or removes a z-line (IP based ban). You must specify at least 3 parameters to add a ban, and one parameter to remove a ban (just the <ip_addr>)\n" +
                "The duration is specified in the following format:  1y2w3d4h5m6s meaning one year, two weeks, three days, 4 hours, 5 minutes and 6 seconds\n" +
                "<ip_addr> is a standard IPv4 address\n" +
                "<duration_string> may not contain any spaces\n" +
                "<reason> must be enclosed in quotations as it may contain spaces\n";
    }
}

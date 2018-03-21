package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandKline extends AbstractType implements Type
{
    public CommandKline()
    {
        super(CommandType.KLINE);
        allowed = new FlagType[]{FlagType.NICK, FlagType.DURATION, FlagType.REASON};
    }

    public String help()
    {
        return "Syntax: /kline --nick=<user@host> --duration=<duration_string> --reason=\"<reason>\"\n" +
                "Sets or removes a k-line (host based ban) on a host and user mask.\n" +
                "You must specifiy at least 3 parameters to add a ban, and one parameter to remove a ban (just the user@host section)\n" +
                "The duration is specified in the following format: 1y2w3d4h5m6s meaning one year, two weeks, three days, 4 hours, 5 minutes and 6 seconds\n" +
                "KLINE is checked before the user registers\n" +
                "<user@host> must not contain any spaces\n" +
                "<duration_string> must not contain any spaces\n" +
                "<reason> must be enclosed in quotations as it may contain spaces\n";
    }
}

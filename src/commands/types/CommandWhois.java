package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandWhois extends AbstractType implements Type
{
    public CommandWhois()
    {
        super(CommandType.WHOIS);
        allowed = new FlagType[]{FlagType.NICK,FlagType.SERVER};
    }

    public String help()
    {
        return "Syntax: /whois --nick=<nicname>[,<nicknames>] --server=<server>[,<servers>]\n" +
                "Returns the WHOIS information of a user given by <nickname>, their channels, hostname, etc.\n" +
                "<nickname> must not contain spaces or the @ symbol\n" +
                "<server> must not contain spaces or the @ symbol\n" +
                "Multiple nicknames or servers must be comma separated\n";
    }
}

package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandWhowas extends AbstractType implements Type
{
    public CommandWhowas()
    {
        super(CommandType.WHOWAS);
        allowed = new FlagType[]{FlagType.NICK};
    }

    public String help()
    {
        return "Syntax: /whowas --nick=<nickname>\n" +
                "Returns a list of times the user given by <nickname> was last seen on CoffeeShop and the last time they were seen on their server\n" +
                "<nickname> must not contain spaces or the @ symbol\n";
    }
}

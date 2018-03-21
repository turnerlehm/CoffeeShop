package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandPass extends AbstractType implements Type
{
    public CommandPass()
    {
        super(CommandType.PASS);
        allowed = new FlagType[]{FlagType.PASSWORD};
    }

    public String help()
    {
        return "Syntax: /pass --pass=\"<password>\"\n" +
                "This command is used by your CoffeeShop client when setting up a session, it should not be issued by a fully connected client\n";
    }
}

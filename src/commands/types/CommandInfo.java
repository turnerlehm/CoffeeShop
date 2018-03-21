package commands.types;

import commands.CommandType;

public class CommandInfo extends AbstractType implements Type
{
    public CommandInfo()
    {
        super(CommandType.INFO);
    }

    @Override
    public String help() {
        return "Syntax: /info\n"+
                "Returns the information on the developers and supporters who made this CoffeeShop server possible\n";
    }
}

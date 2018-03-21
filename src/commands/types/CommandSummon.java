package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandSummon extends AbstractType implements Type
{
    public CommandSummon()
    {
        super(CommandType.SUMM);
    }

    public String help()
    {
        return "Summons a user from the shel where CoffeeShop is running into the network\n" +
                "--- Not currently supported ---\n";
    }
}

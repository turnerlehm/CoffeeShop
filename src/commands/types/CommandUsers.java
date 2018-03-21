package commands.types;

import commands.CommandType;

public class CommandUsers extends AbstractType implements Type
{
    public CommandUsers()
    {
        super(CommandType.USERS);

    }

    public String help()
    {
        return "Shows users logged into the shell where CoffeeShop is running\n" +
                "--- Not currently supported ---\n";
    }
}

package commands.types;

import commands.CommandType;

public class CommandRules extends AbstractType implements Type
{
    public CommandRules()
    {
        super(CommandType.RULES);
    }

    @Override
    public String help() {
        return "Syntax: /rules\n"+
                "Show the rules for the local server/channel\n";
    }
}

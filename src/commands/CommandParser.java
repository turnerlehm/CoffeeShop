package commands;

import commands.types.*;

public class CommandParser
{
    private static CommandParser instance = null;

    private CommandParser(){}

    public static CommandParser getInstance()
    {
        if(instance == null)
            instance = new CommandParser();
        return instance;
    }

}

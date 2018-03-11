package commands.types;

import commands.CommandType;
import commands.Flag;
import commands.FlagType;
import commands.InvalidCommandException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractType implements Type
{
    public final CommandType type;
    private List<Flag> flags;
    protected FlagType[] allowed;

    protected AbstractType(CommandType type)
    {
        this.type = type;
        this.flags = Collections.synchronizedList(new ArrayList<>());
    }

    public void addFlag(Flag f) throws InvalidCommandException
    {
        boolean added = false;
        for(int i = 0; i < allowed.length; i++)
        {
            if(f.flag.equals(allowed[i]))
            {
                flags.add(f);
                added = true;
                break;
            }
        }
        if(!added)
            throw new InvalidCommandException("Invalid flag for command");
    }

    public List<Flag> getFlags(){return flags;}

    public CommandType getType()
    {
        return type;
    }

    public abstract String help();
}

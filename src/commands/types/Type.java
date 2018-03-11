package commands.types;

import commands.*;

import java.util.List;

public interface Type
{
    public abstract void addFlag(Flag f) throws InvalidCommandException;
    public abstract List<Flag> getFlags();
    public abstract CommandType getType();
}

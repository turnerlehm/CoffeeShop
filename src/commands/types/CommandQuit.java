package commands.types;

import commands.CommandType;
import commands.Flag;
import commands.FlagType;
import commands.InvalidCommandException;

public class CommandQuit extends AbstractType implements Type
{
    public CommandQuit()
    {
        super(CommandType.QUIT);
        allowed = new FlagType[]{FlagType.REASON};
    }

    public void addFlag(Flag f) throws InvalidCommandException
    {
        super.addFlag(f);
    }
    @Override
    public String help() {
        return "Syntax: /quit [--reason=<reason>]\n"+
                "Quits from the chat network and ends your current session with the given <reason>\n"+
                "The flag --reason is optional\n";
    }
}

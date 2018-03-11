package commands.types;

import commands.CommandType;
import commands.Flag;
import commands.FlagType;
import commands.InvalidCommandException;

public class TypeUser extends AbstractType implements Type
{

    protected TypeUser()
    {
        super(CommandType.USER);
        allowed = new FlagType[]{FlagType.IDENT, FlagType.LHOST, FlagType.RHOST};
    }

    public void addFlag(Flag f) throws InvalidCommandException
    {
        super.addFlag(f);
    }

    public String help()
    {
        return "Syntax: /user --name=<username> --hostname=<hostname> --server=<servername> --real=\"<realname>\""+
                "username may not contain any spaces"+
                "hostname may not contain any spaces"+
                "servername may not contain any spaces"+
                "realname may contain spaces, but must be contained in quotes";
    }
}

package commands.types;

import commands.CommandType;
import commands.Flag;
import commands.FlagType;
import commands.InvalidCommandException;

public class CommandUser extends AbstractType implements Type
{

    public CommandUser()
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
        return "Syntax: /user --name=<username> --hostname=<hostname> --server=<servername> --real=\"<realname>\"\n"+
                "This command is used at the beginning of a connection to specify the username, hostname, real name, and initial user modes of the connecting client\n"+
                "This command registers your chat session with the network\n"+
                "<username> may not contain any spaces\n"+
                "<hostname> may not contain any spaces\n"+
                "<servername> may not contain any spaces\n"+
                "<realname> may contain spaces, but must be contained in quotes\n"+
                "This command should generally not be used by a user";
    }
}

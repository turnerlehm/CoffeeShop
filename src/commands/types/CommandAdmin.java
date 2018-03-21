package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandAdmin extends AbstractType implements Type
{

    public CommandAdmin()
    {
        super(CommandType.ADMIN);
        allowed = new FlagType[]{FlagType.SERVER};
    }

    @Override
    public String help() {
        return "Syntax: /admin [--server=<server>]\n"+
                "Fetches the administrative information of the server named by <server> or the administrative info of\n"+
                "the current server if the --server flag is not used\n"+
                "The --server flag is optional\n"+
                "<server> must not contain spaces\n";
    }
}

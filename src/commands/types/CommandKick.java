package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandKick extends AbstractType implements Type
{
    public CommandKick()
    {
        super(CommandType.KICK);
        allowed = new FlagType[]{FlagType.CHANNEL, FlagType.NICK, FlagType.REASON};
    }

    @Override
    public String help() {
        return "Syntax: /kick --channel=<channel> --nick=<nick> [--reason=\"<reason>\"\n"+
                "Kicks a user from a channel you specify\n"+
                "In order to kick someone from a channel you must at least be a moderator for the channel where\n"+
                "moderation is enabled, or a channel admin otherwise\n"+
                "The <reason> for the kick must be contained in quotations as it may contain spaces\n";
    }
}

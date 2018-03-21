package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandInvite extends AbstractType implements Type
{
    public CommandInvite()
    {
        super(CommandType.INVITE);
        allowed = new FlagType[]{FlagType.NICK,FlagType.CHANNEL};
    }

    public String help()
    {
        return "Syntax: /invite [--nick=<nickname> --channel=<channel>]\n" +
                "Invites a user given by <nickname> to the channel <channel>\n" +
                "If a channel's mode is PUBLIC, any user currently in that channel may invite other users to the channel\n" +
                "If a channel's mode is PRIVATE, only the channel's moderators and admins may invite users to the channel\n" +
                "If no parameters are given, the channels you are currently invited to, but have not yet joined are listed\n" +
                "<nickname> may not contain any spaces or the @ symbol\n" +
                "<channel> may nto contain spaces or the @ symbol\n";
    }
}

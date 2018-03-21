package commands.types;

import commands.CommandType;
import commands.FlagType;

public class CommandTopic extends AbstractType implements Type
{
    public CommandTopic()
    {
        super(CommandType.TOPIC);
        allowed = new FlagType[]{FlagType.CHANNEL, FlagType.TOPIC};
    }

    @Override
    public String help() {
        return "Syntax: /topic --channel=<channel> [--topic=\"<topic>\"]\n"+
                "Sets or retrieves the topic for a channel\n"+
                "If the optional --topic flag is supplied and you are at least a moderator for <channel> the channel's\n"+
                "topic is changed to the new one you provide\n"+
                "When the --topic flag is used, <topic> must be contained in quotations\n";
    }
}

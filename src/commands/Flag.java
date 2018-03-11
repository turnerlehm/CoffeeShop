package commands;

public class Flag
{
    public final FlagType flag;
    public final String param;
    public Flag(FlagType type, String param)
    {
        this.flag = type;
        this.param = param;
    }
    public boolean equals(Object o)
    {
        if(o instanceof Flag)
        {
            return flag.equals(((Flag)o).flag);
        }
        return false;
    }
}

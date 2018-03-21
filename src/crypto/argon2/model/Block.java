package crypto.argon2.model;
import crypto.argon2.Util;
import java.util.Base64;
import java.util.Arrays;
import static crypto.argon2.Constants.ARGON2_BLOCK_SIZE;
import static crypto.argon2.Constants.ARGON2_QWORDS_IN_BLOCK;
public class Block
{
    public long[] v;

    public Block()
    {
        v = new long[ARGON2_QWORDS_IN_BLOCK];
    }

    public void fromBytes(byte[] input)
    {
        assert input.length == ARGON2_BLOCK_SIZE;
        for(int i = 0; i < v.length; i++)
        {
            byte[] slice = Arrays.copyOfRange(input, i * 8, (i + 1) * 8);
            v[i] = Util.bytesToLong(slice);
        }
    }

    public byte[] toBytes()
    {
        byte[] result = new byte[ARGON2_BLOCK_SIZE];
        for(int i = 0; i < v.length; i++)
        {
            byte[] bytes = Util.longToBytes(v[i]);
            System.arraycopy(bytes, 0, result, i * bytes.length, bytes.length);
        }
        return result;
    }

    public void copyBlock(Block other)
    {
        System.arraycopy(other.v, 0, v, 0, v.length);
    }

    public void xor(Block b1, Block b2)
    {
        for(int i = 0; i < v.length; i++)
            v[i] = b1.v[i] ^ b2.v[i];
    }

    public void xor(Block b1, Block b2, Block b3)
    {
        for(int i = 0; i < v.length; i++)
            v[i] = b1.v[i] ^ b2.v[i] ^ b3.v[i];
    }

    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for(long value : v)
            result.append(Base64.getEncoder().encodeToString(Util.longToBytes(value)));
        return result.toString();
    }

    void clear()
    {
        Arrays.fill(v, 0);
    }
}

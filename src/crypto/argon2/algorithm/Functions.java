package crypto.argon2.algorithm;
import crypto.argon2.Util;
import crypto.argon2.blake2b.Blake2b;
import crypto.argon2.model.Block;
import static crypto.argon2.Constants.*;
public class Functions
{
    static byte[] initialHash(byte[] lanes, byte[] outLen,
    byte[] mem, byte[] iter, byte[] ver, byte[] type, byte[] pwdLen, byte[] pwd, byte[] saltLen, byte[] salt, byte[] secLen, byte[] sec, byte[] addLen, byte[] add)
    {
        Blake2b.Param params = new Blake2b.Param().setDigestLength(ARGON2_PREHASH_DIGEST_LENGTH);
        final Blake2b blake2b = Blake2b.Digest.newInstance(params);
        blake2b.update(lanes);
        blake2b.update(outLen);
        blake2b.update(mem);
        blake2b.update(iter);
        blake2b.update(ver);
        blake2b.update(type);
        blake2b.update(pwdLen);
        if(pwd != null)
            blake2b.update(pwd);
        blake2b.update(saltLen);
        if(salt != null)
            blake2b.update(salt);
        blake2b.update(secLen);
        if(sec != null)
            blake2b.update(sec);
        blake2b.update(addLen);
        if(add != null)
            blake2b.update(add);
        byte[] hash = blake2b.digest();
        assert hash.length == 64;
        return hash;
    }

    static byte[] blake2bLong(byte[] input, int outLen)
    {
        assert input.length == ARGON2_PREHASH_SEED_LENGTH || input.length == ARGON2_BLOCK_SIZE;
        byte[] result = new byte[outLen];
        byte[] outlenBytes = Util.intToBytes(outLen);
        int blake2bLen = 64;
        if(outLen <= blake2bLen)
            result = blake2b(input, outlenBytes, outLen);
        else
        {
            byte[] out;
            out = blake2b(input, outlenBytes, blake2bLen);
            System.arraycopy(out, 0, result, 0, blake2bLen / 2);
            int r = outLen / 32 - 2;
            int pos = blake2bLen / 2;
            for(int i = 2; i <= r; i++, pos += blake2bLen / 2)
            {
                out = blake2b(out, null, blake2bLen);
                System.arraycopy(out, 0, result, pos, blake2bLen / 2);
            }
            int lastLen = outLen - 32 * r;
            out = blake2b(out, null, lastLen);
            System.arraycopy(out, 0, result, pos, lastLen);
        }
        assert result.length == outLen;
        return result;
    }

    private static byte[] blake2b(byte[] input, byte[] outLenBytes, int outLen)
    {
        Blake2b.Param params = new Blake2b.Param().setDigestLength(outLen);
        final Blake2b blake2b = Blake2b.Digest.newInstance();
        if(outLenBytes != null)
            blake2b.update(outLenBytes);
        blake2b.update(input);
        return blake2b.digest();
    }

    static void roundFunction(Block block,
                              int v0, int v1, int v2, int v3,
                              int v4, int v5, int v6, int v7,
                              int v8, int v9, int v10, int v11,
                              int v12, int v13, int v14, int v15)
    {
        F(block, v0, v4, v8, v12);
        F(block, v1, v5, v9, v13);
        F(block, v2, v6, v10, v14);
        F(block, v3, v7, v11, v15);
        F(block, v0, v5, v10, v15);
        F(block, v1, v6, v11, v12);
        F(block, v2, v7, v8, v13);
        F(block, v3, v4, v9, v14);
    }

    private static void F(Block block, int a, int b, int c, int d)
    {
        fBlaMka(block, a, b);
        rotr64(block, d, a, 32);
        fBlaMka(block, c, d);
        rotr64(block, b, c, 24);
        fBlaMka(block, a, b);
        rotr64(block, d, a, 16);
        fBlaMka(block, c, d);
        rotr64(block, b, c, 63);
    }

    private static void fBlaMka(Block b, int x, int y)
    {
        final long m = 0xFFFFFFFFL;
        final long xy = (b.v[x] & m) * (b.v[y] & m);
        b.v[x] = b.v[x] + b.v[y] + 2 * xy;
    }

    private static void rotr64(Block b, int v, int w, long c)
    {
        final long temp = b.v[v] ^ b.v[w];
        b.v[v] = (temp >>> c) | (temp << (64 - c));
    }
}

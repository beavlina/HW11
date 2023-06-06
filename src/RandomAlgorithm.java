public class RandomAlgorithm
{
    private long seed, a, c, m;

    public RandomAlgorithm(long seed)
    {
        this.seed = seed;
    }

    public long getSeed()
    {
        return seed;
    }

    public void setSeed(long seed)
    {
        this.seed = seed;
    }

    public long next(long a, long c, long m)
    {
        this.a = a;
        this.c = c;
        this.m = m;
        return this.seed = (this.a * this.seed + this.c) % this.m;
    }
}

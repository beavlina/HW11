import java.util.stream.Stream;

public class RandomAlgorithmStream
{
    public static void main(String[] args)
    {
        RandomAlgorithm r = new RandomAlgorithm(0);
        var stream = Stream.iterate(0L, (seed) -> r.next(25214903917L, 11L, 2 ^ 48L));
        stream.forEach(c -> System.out.println(c));
    }
}

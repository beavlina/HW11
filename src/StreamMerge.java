import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge
{
    public static void main(String[] args)
    {
        Stream<String> firstStream = Stream.of("Moon", "Earth", "Mars", "Jupiter");
        Stream<String> secondStream = Stream.of("Planet", "Satellite", "Asteroid");
        Stream<String> res = zip(firstStream, secondStream);
        res.peek(System.out::println).collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
    {
        List<T> list = new ArrayList<>();
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext())
        {
            list.add(iteratorFirst.next());
            list.add(iteratorSecond.next());
        }
        return list.stream();

    }
}

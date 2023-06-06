import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
     ClassForHomeWork11 clazz = new ClassForHomeWork11();
     List<String> list = Arrays.asList("Vasyl", "Ivan", "Oleg", "Petr", "Igor", "Stepan", "Georgiy");
        System.out.println(clazz.returnStringWithOddIndex(list));
        System.out.println(clazz.stringToUpperCaseSorted(list));
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};
        clazz.getAllNumbersFromArray(numbers);
    }
}

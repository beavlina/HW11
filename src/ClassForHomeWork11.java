import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClassForHomeWork11
{
    public String returnStringWithOddIndex(List<String> list)
    {
        List<NameAndNumber> numberedNames = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            numberedNames.add(new NameAndNumber(list.get(i), i));
        }
        List<String> strings = numberedNames.stream()
                .filter(c -> c.number % 2 == 1)
                .map(c -> c.number + ". " + c.name)
                .toList();

        return String.join(", ", strings);
    }

    private class NameAndNumber
    {
        public String name;
        public int number;

        public NameAndNumber(String name, int number)
        {
            this.name = name;
            this.number = number;
        }
    }

    public List<String> stringToUpperCaseSorted(List<String> list)
    {
        List<String> resList = list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        return resList;
    }

    public void getAllNumbersFromArray(String[] numbers)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++)
        {
            String str = numbers[i];
            String[] eachNumber = str.split(", ");
            for (int j = 0; j < eachNumber.length; j++)
            {
                arrayList.add(eachNumber[j]);
            }
        }
        List<String> sortedNumbers = arrayList
                .stream()
                .sorted()
                .toList();

        System.out.println("\"" + String.join(", ", sortedNumbers) + "\"");
    }
}

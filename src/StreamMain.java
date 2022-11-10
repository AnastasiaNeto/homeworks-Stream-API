import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*  1.Отфильтруйте положительные числа.
    2.Найдите среди этих положительных чисел четные.
    3.Отсортируйте отфильтрованные числа в порядке возрастания.
    4.Выведите результат на экран  2 4 8 16 32
    Использовать стримы из библиотеки Stream API
 */

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}

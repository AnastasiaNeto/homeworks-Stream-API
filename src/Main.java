import java.util.*;

public class Main {
    public static void main(String[] args) {
/*  1.Отфильтруйте положительные числа.
    2.Найдите среди этих положительных чисел четные.
    3.Отсортируйте отфильтрованные числа в порядке возрастания.
    4.Выведите результат на экран  2 4 8 16 32
    Выполненить работу без использования Collection API и Stream API
 */

    List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    List<Integer> newList = new ArrayList<>();
    for (int x : intList) {
        if (x <= 0) continue;
        if (x % 2 != 0) continue;
        newList.add(x);
    }
        Collections.sort(newList);
    for (int i: newList) System.out.print(i + " ");
    }
}

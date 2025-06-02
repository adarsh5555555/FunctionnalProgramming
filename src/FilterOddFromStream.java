import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterOddFromStream {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10);

            System.out.println("By using funstional programing without lambda \n");
            myList.stream().filter(new Predicate<Integer>() {
                @Override
                public boolean test(Integer integer) {
                    if (integer % 2 == 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }).forEach(new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) {
                    System.out.println(integer);
                }
            });
            System.out.println("By using functional programming with lambda\n");
            myList.stream()
                    .filter(j -> j % 2 == 0 ? false : true)
                    .forEach(j -> System.out.println(j));


        }
    }

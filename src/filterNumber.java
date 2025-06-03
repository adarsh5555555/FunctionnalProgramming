import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class filterNumber {
    public static void main(String[] args) {
        List<Integer> mylist = List.of(3, 2);
        System.out.println("By using functional programming\n");
       int multiplication=  mylist.stream()
                .reduce(1,new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
             return integer*integer2;
            }
        });
        System.out.printf("required multiplivcation is %d",multiplication);
        System.out.println("\nby using lambda\n");
        int multiplication2 = mylist.stream().reduce(1,(a,b)->a*b);
        System.out.printf("your required multiplication using lambda is %d", multiplication2);
        System.out.println("By using imperative programming\n");
        long multiplication3 = 1;
        for (Integer i : mylist) {
            multiplication3 =multiplication3*i;

        }
        System.out.printf("the required multiplication is %d",multiplication3);

    }
}
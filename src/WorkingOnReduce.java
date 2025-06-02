import java.util.List;
import java.util.function.BinaryOperator;

public class WorkingOnReduce {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1,2,3,4,5,6,7);
        System.out.println("by using for loop \n");
        long multiply=1;
        for (Integer i : myList) {
            multiply = multiply * i;

        }System.out.println(multiply);
        System.out.println("by using functional programming \n");
       int multiplication = myList.stream().reduce(1,new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer*integer2;
            }
        });
        System.out.println(multiplication);
        System.out.println("functional programming by using lambda \n");
       int mul= myList.stream().reduce(1,(a,b)->a*b);
        System.out.println(mul);

    }

}

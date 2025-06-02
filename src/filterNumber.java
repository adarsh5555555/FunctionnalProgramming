import java.util.List;
import java.util.function.BinaryOperator;

public class filterNumber {
    public static void main(String[] args) {
       List <Integer> mylist = List.of(3,2);
        System.out.println("from functional programming");
       int multiplication = mylist.stream().reduce(1, new BinaryOperator<Integer>() {
           @Override
           public Integer apply(Integer integer, Integer integer2) {

               return integer * integer2;
           }

       });
        System.out.println(multiplication);
        System.out.println("by forloop \n");
        int j=1;
        for (Integer i : mylist) {
            j=j*i;

        }
        System.out.println(j);
        System.out.println("\n by functional programming and using lambda");
       int multiply = mylist.stream().reduce(1,(a,b)->a*b);
        System.out.println(multiply);



    }
}

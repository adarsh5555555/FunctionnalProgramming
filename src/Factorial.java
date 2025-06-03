import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number whose factorial you wanna calculate : \n");

        int num = input.nextInt();
        System.out.println("by using imperative programming");
        long fact=1;
        for(int i=num ;i>0;i--){
            fact = fact *i;
        }
        System.out.println(fact);
        System.out.println("by using functional programming \n");
        List<Integer> newList = List.of(1,2,3,4,5,6,7,8,9,10);
     int miltiply =   newList.stream().
             reduce(1,(a,b)->a*b);
        System.out.println(miltiply);




    }

}
